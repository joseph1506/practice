package practice.factory.Singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingleEarth implements Serializable {
    //Eager initialization
    //private static SingleEarth singleEarth= new SingleEarth();
    private static SingleEarth singleEarth;

    private SingleEarth(){
        System.out.println("Inside Constructor");
        if (singleEarth != null) {
            throw new IllegalStateException("Singleton" +
                    " instance already created.");
        }
    }

    /*public static SingleEarth createInstance(){
       return singleEarth;
    }*/

    //Lazy initialization
    public static SingleEarth createInstance(){
        if(singleEarth==null){
            synchronized (SingleEarth.class){
                if(singleEarth==null){
                    singleEarth=new SingleEarth();
                }
            }
        }
        return singleEarth;
    }

    public void printClassHash(){
        System.out.println("Object-->"+this);
    }

    public Object clone() throws CloneNotSupportedException{
        return singleEarth;
    }

    public Object readResolve() throws ObjectStreamException {
        return singleEarth;
    }

}
