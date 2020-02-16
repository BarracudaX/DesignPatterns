package factories.pizza;

import factories.pizza.ingredients.*;
import factories.pizza.ingredients.clams.FreshClams;
import factories.pizza.ingredients.common.SlicedPepperoni;
import factories.pizza.ingredients.ny.MarinaraSauce;
import factories.pizza.ingredients.ny.ReggianoCheese;
import factories.pizza.ingredients.ny.ThinCrustDough;
import factories.pizza.ingredients.veggies.Garlic;
import factories.pizza.ingredients.veggies.Mushroom;
import factories.pizza.ingredients.veggies.Onion;
import factories.pizza.ingredients.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
            return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
