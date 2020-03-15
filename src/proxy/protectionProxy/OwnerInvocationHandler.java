package proxy.protectionProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

    private final PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("setHotOrNotRating")) {
            throw new IllegalAccessException("You cannot change your own 'hot or not' rate.");
        } else if (method.getName().startsWith("get") || method.getName().startsWith("set")) {
            return method.invoke(person, args);
        }

        return null;
    }

}
