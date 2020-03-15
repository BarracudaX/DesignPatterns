package state;

public class SoldOutState implements State {

    private transient final GumballMachine machine;

    private final String stateName = "Sold Out State";

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("I am sold out.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("The machine is out of gumballs.");
    }

    @Override
    public void turnCrank() {
        System.out.println("The machine is out of gumballs.");
    }

    @Override
    public void dispense() {
        System.out.println("The machine is out of gumballs.");
    }

    @Override
    public void refill(int x) {
        if (x > 0) {
            this.machine.addGumballs(x);
            this.machine.setState(machine.getNoQuarterState());
        }
    }

    @Override
    public String getStateName() {
        return stateName;
    }

    private void checkIfHasGumballs(){
        if (machine.getCount() > 0) {
            System.out.println("New gumballs arrived!");
            machine.setState(machine.getNoQuarterState());
        }else{
            System.out.println("Sorry,we are out of gumballs.");
        }
    }

}
