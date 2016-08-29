package practice.factory.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingletonReflection {

    public static void main(String args[]) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException, InstantiationException {
        SingleEarth earth=SingleEarth.createInstance();
        earth.printClassHash();

        Class earthClass=SingleEarth.class;
        Constructor privateCons= earthClass.getDeclaredConstructors()[0];
        privateCons.setAccessible(true);
        SingleEarth earth1= (SingleEarth) privateCons.newInstance(null);
        earth1.printClassHash();



    }

}
