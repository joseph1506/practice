package practice.rmi;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderImpl extends UnicastRemoteObject implements Adder {

    public AdderImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int number1, int number2) throws RemoteException {
        return (number1+number2);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
