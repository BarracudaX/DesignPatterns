package iteratorAndComposite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {

    private final List<MenuItem> menuItems = new ArrayList<>();

    public PancakeHouseMenu(){
        menuItems.add(new MenuItem("K & B’s Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99));
        menuItems.add(new MenuItem(("“Regular Pancake Breakfast”"),
                "“Pancakes with fried eggs, sausage”",
                false,
                2.99));
        menuItems.add(new MenuItem("“Blueberry Pancakes”",
                "“Pancakes made with fresh blueberries”",
                true,
                3.49));
        menuItems.add(new MenuItem("“Waffles”",
                "“Waffles, with your choice of blueberries or strawberries”",
                true,
                3.59));
    }

    public final void addItem(MenuItem item) {
        menuItems.add(item);
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return menuItems.iterator();
    }


}
