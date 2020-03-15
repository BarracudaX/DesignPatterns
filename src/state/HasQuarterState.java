package state;

import java.util.Random;

public class HasQuarterState implements State {

    private transient final GumballMachine machine;

    private transient final Random random = new Random(System.currentTimeMillis());

    private final String stateName = "Has Quarter State";

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter has already been inserted.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Ejecting the quarter.");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You've turned the crank...");
        int winner = random.nextInt(10);
        if (winner == 0 && machine.getCount() > 1) {
            machine.setState(machine.getWinnerState());
        }else{
            machine.setState(machine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}
