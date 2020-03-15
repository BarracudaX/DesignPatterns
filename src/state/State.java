package state;

import java.io.Serializable;

public interface State extends Serializable {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    default void refill(int x){
        if (x == 0) {
            System.out.println("I don't need to refill myself.");
        }
    }

    String getStateName();

}
