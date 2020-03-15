package proxy.remoteProxy;

import state.GumballMachine;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        RemoteGumballMachine remoteObject = new GumballMachine(10,"Location1");
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.bind("RemoteGumballMachine",remoteObject);
        System.err.println("Server Started.");
    }

}
