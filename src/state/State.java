package state;

public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    default void refill(int x){
        if (x == 0) {
            System.out.println("I don't need to refill myself.");
        }
    }

}
