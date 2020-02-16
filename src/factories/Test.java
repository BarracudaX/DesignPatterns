package factories;

import factories.pizza.Pizza;

public class Test {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();

        Pizza ethanPizza = nyPizzaStore.orderPizza("cheese");

        System.out.println("Ethan ordered a "+ethanPizza.getName()+"\n");

        Pizza joelPizza = chicagoPizzaStore.orderPizza("cheese");

        System.out.println("Joel ordered a "+joelPizza.getName()+"\n");
    }

}
