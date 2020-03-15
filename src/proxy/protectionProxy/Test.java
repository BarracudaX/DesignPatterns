package proxy.protectionProxy;

public class Test {

    public static void main(String[] args) {
        PersonBean joe_owner = PersonProxyFactory.getOwnerProxy(new Person("Joe", "Male", "Football,books"));
        PersonBean maria_not_owner = PersonProxyFactory.getNotOwnerProxy(new Person("Maria", "Female", "music,basketball"));

        System.out.println("Calling getter methods on owner proxy: ");
        joe_owner.getGender();
        joe_owner.getHotOrNotRating();
        joe_owner.getInterests();
        joe_owner.getName();
        System.out.println("Successful invocation of all getters on owner proxy.");

        System.out.println("Calling allowed set methods on owner method: ");
        joe_owner.setGender("MALE");
        joe_owner.setInterests("Books");
        joe_owner.setName("Joe");
        System.out.println("Successful invocation of all allowed setter methods on owner proxy");

        System.out.println("Invoking not allowed setter method on owner proxy.Expecting an exception");
        try {
            joe_owner.setHotOrNotRating(10);
            System.err.println("Error!Expected exception to be thrown.");
        } catch (Exception e) {
            System.out.println("Exception has been throws successfully.Exceptions' message = " + e.getCause().getMessage());
        }

        System.out.println("\n\n");

        System.out.println("Calling getter methods on not owner proxy:");
        maria_not_owner.getGender();
        maria_not_owner.getHotOrNotRating();
        maria_not_owner.getInterests();
        maria_not_owner.getName();
        System.out.println("Successful invocation of all getters on not owner proxy.");


        System.out.println("Calling allowed set methods on not owner method: ");
        maria_not_owner.setHotOrNotRating(9);
        System.out.println("Successful invocation of all allowed setter methods on not owner proxy");

        System.out.println("Invoking not allowed setter methods on not owner proxy.Expecting an exception");

        try {
            maria_not_owner.setName("Maria");
            System.err.println("Error!Expected exception to be thrown.");
        } catch (Exception e) {
            System.out.println("Exception has been throws successfully.Exceptions' message = " + e.getCause().getMessage());
        }

        try {
            maria_not_owner.setInterests("Books");
            System.err.println("Error!Expected exception to be thrown.");
        } catch (Exception e) {
            System.out.println("Exception has been throws successfully.Exceptions' message = " + e.getCause().getMessage());
        }

        try {
            maria_not_owner.setGender("FEMALE");
            System.err.println("Error!Expected exception to be thrown.");
        } catch (Exception e) {
            System.out.println("Exception has been throws successfully.Exceptions' message = " + e.getCause().getMessage());
        }


    }

}
