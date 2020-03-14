package iteratorAndComposite;

import java.util.Iterator;

public class DinerMenu implements Menu {

    private static final int MAX_ITEMS = 6;

    private final MenuItem[] menuItems = new MenuItem[MAX_ITEMS];

    private int nextItemInMenu = 0;

    public DinerMenu(){
        addItem(new MenuItem("“Vegetarian BLT”",
                "“(Fakin’) Bacon with lettuce & tomato on whole wheat”", true, 2.99));
        addItem(new MenuItem("“BLT”",
                "“Bacon with lettuce & tomato on whole wheat”", false, 2.99));
        addItem(new MenuItem("“Soup of the day”",
                "“Soup of the day, with a side of potato salad”", false, 3.29));
        addItem(new MenuItem("“Hotdog”",
                "“A hot dog, with saurkraut, relish, onions, topped with cheese”",
                false, 3.05));

    }

    public final void addItem(MenuItem item) {
        if (nextItemInMenu == MAX_ITEMS) {
            System.err.println("Sorry,menu is full!Can't add item to menu");
            return ;
        }

        menuItems[nextItemInMenu] = item;
        nextItemInMenu = nextItemInMenu + 1;
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new ArrayIterator<>(menuItems);
    }

    private static class ArrayIterator<E> implements Iterator<E> {

        private final E[] elements ;

        private int nextElementPosition = 0;

        public ArrayIterator(E[] elements) {
            this.elements = elements;
        }

        @Override
        public boolean hasNext() {
            return nextElementPosition < this.elements.length && elements[nextElementPosition] != null;
        }

        @Override
        public E next() {
            E element = elements[nextElementPosition];
            nextElementPosition = nextElementPosition + 1;
            return element;
        }
    }

}
