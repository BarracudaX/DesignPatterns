package proxy.remoteProxy;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry();
        RemoteGumballMachine remoteGumballMachine = (RemoteGumballMachine) registry.lookup("RemoteGumballMachine");
        GumballMonitor monitor = new GumballMonitor(remoteGumballMachine);

        monitor.printCurrentState();
        monitor.printLocation();
        monitor.printNumberOfGumballs();
    }

}
