package iteratorAndComposite;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {

    private final Map<String, MenuItem> items = new HashMap<>();

    public CafeMenu(){
        addItem(new MenuItem("“Veggie Burger and Air Fries”",
                "“Veggie burger on a whole wheat bun, lettuce, tomato, and fries”",
                true, 3.99));
        addItem(new MenuItem("“Soup of the day”",
                "“A cup of the soup of the day, with a side salad”",
                false, 3.69));
        addItem(new MenuItem("“Burrito”",
                "“A large burrito, with whole pinto beans, salsa, guacamole”",
                true, 4.29));
    }

    public final void addItem(MenuItem menuItem) {
        items.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return items.values().iterator();
    }
}
