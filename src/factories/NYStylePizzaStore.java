package factories;

import factories.pizza.NYPizzaIngredientFactory;
import factories.pizza.Pizza;
import factories.pizza.PizzaIngredientFactory;
import factories.pizza.common.CheesePizza;
import factories.pizza.common.ClamPizza;
import factories.pizza.common.PepperoniPizza;
import factories.pizza.common.VeggiesPizza;

public class NYStylePizzaStore extends PizzaStore {

    private final PizzaIngredientFactory ingredientFactory;

    public NYStylePizzaStore() {
        ingredientFactory = new NYPizzaIngredientFactory();
    }

    @Override
    public Pizza getPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else if (type.equals("veggie")) {
            pizza = new VeggiesPizza(ingredientFactory);
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
        }

        return pizza;
    }

}
