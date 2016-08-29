package practice.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeDemolitionMan {
    public DemolitionMan deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("G://Learn//testSer.ser");
        ObjectInputStream ois= new ObjectInputStream(fis);
        DemolitionMan iAmBack=(DemolitionMan) ois.readObject();
        ois.close();
        return iAmBack;
    }
}
