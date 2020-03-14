package iteratorAndComposite;

import java.util.Iterator;

public class Waitress {

    private final Menu dinerMenu;

    private final Menu pancakeHouseMenu;

    public Waitress(Menu dinerMenu, Menu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu(){
        System.out.println("MENU\n-----\nBREAKFAST");
        printMenu(dinerMenu.iterator());
        System.out.println("\nLUNCH");
        printMenu(pancakeHouseMenu.iterator());
    }


    private void printMenu(Iterator<MenuItem> items) {
        while (items.hasNext()) {
            MenuItem menuItem = items.next();
            System.out.print(menuItem.getName() + ",");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
