package state;

public class NoQuarterState implements State {

    private final GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You've inserted a quarter.");
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted any quarter.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned,but there is no quarter..");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first.");
    }
}
