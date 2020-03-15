package proxy.protectionProxy;

import java.lang.reflect.Proxy;

public class PersonProxyFactory {

    public static PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new OwnerInvocationHandler(personBean));
    }

    public static PersonBean getNotOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new NotOwnerInvocationHandler(personBean));
    }



}
