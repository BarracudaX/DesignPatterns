package factories.pizza.common;

import factories.pizza.Pizza;
import factories.pizza.PizzaIngredientFactory;

public class VeggiesPizza extends Pizza {

    private final PizzaIngredientFactory ingredientFactory;

    public VeggiesPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+ name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
