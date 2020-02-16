package factories;

import factories.pizza.Pizza;

public abstract class PizzaStore {

    public final Pizza orderPizza(String type){
        Pizza pizza = getPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza getPizza(String type);

}
