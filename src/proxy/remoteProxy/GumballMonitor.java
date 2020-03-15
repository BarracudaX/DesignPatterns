package proxy.remoteProxy;

import java.rmi.RemoteException;

public class GumballMonitor {

    private final RemoteGumballMachine machine;

    public GumballMonitor(RemoteGumballMachine machine) {
        this.machine = machine;
    }

    public void printNumberOfGumballs() throws RemoteException {
        System.out.println(this.machine.getCount());
    }

    public void printLocation() throws RemoteException {
        System.out.println(this.machine.getLocation());
    }

    public void printCurrentState() throws RemoteException {
        System.out.println(this.machine.getCurrentState().getStateName());
    }



}
