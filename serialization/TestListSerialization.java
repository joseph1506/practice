package practice.serialization;

import practice.casting.Dog;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestListSerialization {


    public static void serialize(ObjectHavingList dm) throws IOException {
        FileOutputStream fs= new FileOutputStream("C://DATA//Learn//testList.ser");
        ObjectOutputStream os=new ObjectOutputStream(fs);
        os.writeObject(dm);
        os.close();
    }

    public static ObjectHavingList deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("C://DATA//Learn//testList.ser");
        ObjectInputStream ois= new ObjectInputStream(fis);
        ObjectHavingList object=(ObjectHavingList) ois.readObject();
        ois.close();
        return object;
    }



    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List objects= new ArrayList();
        objects.add("Object1");
        objects.add(new Integer(5));
        objects.add(new Dog());
        ObjectHavingList object=new ObjectHavingList(objects);
        //TestListSerialization.serialize(object);

        ObjectHavingList deserializedObject=TestListSerialization.deserialize();
        System.out.println(deserializedObject);

    }
}
