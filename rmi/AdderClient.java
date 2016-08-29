package practice.rmi;

import java.rmi.Naming;

public class AdderClient {

    public static void main(String args[]){
        try{
           Adder stub=(Adder) Naming.lookup("rmi://172.31.209.94:5000/adder");
           System.out.println("Addition---->"+stub.add(5,90));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
