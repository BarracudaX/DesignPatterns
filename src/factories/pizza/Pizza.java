package factories.pizza;

import factories.pizza.ingredients.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Pizza {

    public String name;

    public Dough dough;

    public Sauce sauce;

    public Veggies[] veggies;

    public Cheese cheese;

    public Pepperoni pepperoni;

    public Clams clams;

    protected Pizza(){

    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    public abstract void prepare() ;

    public void box(){
        System.out.println("Place pizza in official PizzaStore box.");
    }

    public String getName() {
        return name;
    }
}
