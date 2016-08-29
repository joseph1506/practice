package practice.rmi;

import java.rmi.Naming;

public class Server {

    public static void main(String args[]){

        try{
        Adder adder= new AdderImpl();
        Naming.bind("rmi://172.31.209.94:5000/adder",adder);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
