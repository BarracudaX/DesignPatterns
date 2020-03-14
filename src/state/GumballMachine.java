package state;

public class GumballMachine {
    private final State soldOutState;
    private final State noQuarterState;
    private final State hasQuarterState;
    private final State soldState;
    private final State winnerState;

    private State currentState ;
    private int count = 0;


    public GumballMachine(int numberOfGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);
        count = numberOfGumballs;
        if (count > 0) {
            currentState = noQuarterState;
        }else{
            currentState = soldOutState;
        }
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public int getCount() {
        return count;
    }

    void setState(State state) {
        currentState = state;
    }

    State getHasQuarterState() {
        return hasQuarterState;
    }

    State getSoldOutState() {
        return soldOutState;
    }

    State getNoQuarterState() {
        return noQuarterState;
    }

    State getSoldState() {
        return soldState;
    }

    State getWinnerState() {
        return winnerState;
    }

    void addGumballs(int x) {
        count += x;
    }
}
