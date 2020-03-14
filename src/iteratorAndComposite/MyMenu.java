package iteratorAndComposite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyMenu implements MenuComponent {

    private final String name;

    private final String description;

    private final List<MenuComponent> menuComponents = new ArrayList<>();


    public MyMenu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println(" " + getDescription());
        System.out.println("-----------------------");
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    @Override
    public Iterator<MenuComponent> iterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
