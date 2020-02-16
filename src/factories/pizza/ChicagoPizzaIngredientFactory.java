package factories.pizza;

import factories.pizza.ingredients.*;
import factories.pizza.ingredients.chicago.Mozzarella;
import factories.pizza.ingredients.chicago.PlumTomatoSauce;
import factories.pizza.ingredients.chicago.ThickCrustDough;
import factories.pizza.ingredients.clams.FrozenClams;
import factories.pizza.ingredients.common.SlicedPepperoni;
import factories.pizza.ingredients.veggies.BlackOlives;
import factories.pizza.ingredients.veggies.EggPlant;
import factories.pizza.ingredients.veggies.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new EggPlant(),new BlackOlives(),new Spinach()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
