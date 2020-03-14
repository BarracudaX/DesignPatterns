package iteratorAndComposite;

public class CompositeWaitress {

    private final MenuComponent menus;

    public CompositeWaitress(MenuComponent menus) {
        this.menus = menus;
    }

    public void printMenu(){
        this.menus.print();
    }

    public void printVegetarian(){
        for (MenuComponent item : menus) {
            try {
                if (item.isVegetarian()) {
                    item.print();
                }
            } catch (UnsupportedOperationException ignored) {

            }
        }
    }

}
