package practice.factory.Singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeEarth {
    public static SingleEarth deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("C://DATA//D Drive//Learn//testSerEarth.ser");
        ObjectInputStream ois= new ObjectInputStream(fis);
        SingleEarth iAmBack=(SingleEarth) ois.readObject();
        ois.close();
        return iAmBack;
    }
}
