package proxy.protectionProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NotOwnerInvocationHandler implements InvocationHandler {

    private final PersonBean person;

    public NotOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("setHotOrNotRating") || method.getName().startsWith("get")){
            return method.invoke(person, args);
        }else if (method.getName().startsWith("set")) {
            throw new IllegalAccessException("You cannot call setter method "+method.getName()+" of another person.");
        }
        return null;
    }
}
