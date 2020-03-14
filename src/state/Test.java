package state;

public class Test {

    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5);

        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
    }

}
