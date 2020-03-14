package iteratorAndComposite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {

    private final Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } else {
            Iterator<MenuComponent> peek = stack.peek();
            if (!peek.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        Iterator<MenuComponent> iterator = stack.peek();
        MenuComponent next = iterator.next();
        if (next instanceof MyMenu) {
            stack.push(next.iterator());
        }
        return next;

    }
}
