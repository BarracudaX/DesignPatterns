package iteratorAndComposite;

public class CompositeTest {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new MyMenu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new MyMenu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new MyMenu("CAFE MENU", "Diner");
        MenuComponent dessertMenu = new MyMenu("DESSERT MENU", "Dessert");

        MenuComponent allMenus = new MyMenu("ALL MENUS", "All menus combined!");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem(
                "“Pasta”",
                "“Spaghetti with Marinara Sauce, and a slice of sourdough bread”",
                true,
                3.89));
        dessertMenu.add(new MenuItem("“Apple Pie”",
                "“Apple pie with a flakey crust, topped with vanilla icecream”",
                true,
                1.59));
        dinerMenu.add(dessertMenu);


        CompositeWaitress waitress = new CompositeWaitress(allMenus);

        waitress.printMenu();

        System.out.println("\n Vegetarian : ");
        waitress.printVegetarian();
    }

}
