package proxy.remoteProxy;

import state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteGumballMachine extends Remote {


    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getCurrentState() throws RemoteException;


}
