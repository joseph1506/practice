package practice.factory.Singleton;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEarth {

    public static void serialize(SingleEarth earth) throws IOException {
        FileOutputStream fs= new FileOutputStream("C://DATA//D Drive//Learn//testSerEarth.ser");
        ObjectOutputStream os=new ObjectOutputStream(fs);
        os.writeObject(earth);
        os.close();
    }
}
