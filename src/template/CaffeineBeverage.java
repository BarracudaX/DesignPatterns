package template;

public abstract class CaffeineBeverage {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (shouldAddCondimentsHook()) {
            addCondiments();
        }

    }


    private void pourInCup() {
        System.out.println("Pouting into cup.");
    }


    private void boilWater() {
        System.out.println("Boiling water.");
    }

    public abstract void brew();

    public abstract void addCondiments();

    public boolean shouldAddCondimentsHook(){
        return false;
    }

}
