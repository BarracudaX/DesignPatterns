package state;

import java.rmi.RemoteException;

public class Test {

    public static void main(String[] args) throws RemoteException {
        GumballMachine machine = new GumballMachine(5,"Location1");

        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
    }

}
