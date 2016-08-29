package practice.rmi;

import java.rmi.*;

public interface Adder extends Remote{
     public int add(int number1,int number2)throws RemoteException;
}


