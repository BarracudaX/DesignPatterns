package template;

public class Tea extends CaffeineBeverage {

    private void addLemon() {
    }


    @Override
    public void brew() {
        System.out.println("Steeping the tea.");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon.");
    }

    @Override
    public boolean shouldAddCondimentsHook() {
        return true;
    }
}
