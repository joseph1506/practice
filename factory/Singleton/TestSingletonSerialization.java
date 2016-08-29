package practice.factory.Singleton;

import java.io.IOException;

public class TestSingletonSerialization {

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        SingleEarth earth= SingleEarth.createInstance();
        earth.printClassHash();

        SerializeEarth.serialize(earth);
        SingleEarth newEarth=DeSerializeEarth.deserialize();
        newEarth.printClassHash();
    }



}
