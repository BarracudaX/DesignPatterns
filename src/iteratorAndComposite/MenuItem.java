package iteratorAndComposite;

import java.util.Iterator;

public class MenuItem implements MenuComponent {

    private final String name;

    private final String description;

    private final boolean vegetarian;

    private final double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print("" + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(" , " + getPrice());
        System.out.println(" -- " + getDescription());
    }

    @Override
    public Iterator<MenuComponent> iterator() {
        return new NullIterator<>();
    }
}
