package practice.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemolitionMan {

    public void serialize(DemolitionMan dm) throws IOException {
        FileOutputStream fs= new FileOutputStream("G://Learn//testSer.ser");
        ObjectOutputStream os=new ObjectOutputStream(fs);
        os.writeObject(dm);
        os.close();
    }
}
