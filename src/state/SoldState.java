package state;

public class SoldState implements State {

    private transient final GumballMachine machine;

    private final String stateName = "Sold State";

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait,we're already giving you a gumball.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry,you've already turned the crank.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        machine.releaseBall();
        if (machine.getCount() == 0) {
            System.out.println("Oops,out of gumballs.");
            machine.setState(machine.getSoldOutState());
        }else{
            machine.setState(machine.getNoQuarterState());
        }
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}
