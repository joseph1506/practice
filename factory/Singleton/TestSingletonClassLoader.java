package practice.factory.Singleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class TestSingletonClassLoader {

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        URL classUrl;
        //classUrl = new URL("file:///C://DATA/D Drive/R31Version/sqe-ivpn-web/build/classes/practice/factory/Singleton");
        classUrl = new URL("file:///C://DATA/D Drive/R31Version/sqe-ivpn-web/build/classes/");
        //classUrl = new URL("file:///C://DATA/");
        URL[] classUrls = { classUrl };

        ClassLoader parent=TestSingletonClassLoader.class.getClassLoader();

        ClassLoader cl1= new URLClassLoader(classUrls,null);
        ClassLoader cl2= new URLClassLoader(classUrls,null);

        Class<?> earth1=cl1.loadClass("practice.factory.Singleton.SingleEarth");
        Class<?> earth2=cl2.loadClass("practice.factory.Singleton.SingleEarth");

        /*Class<?> earth1=Class.forName("SingleEarth",true,cl1);
        Class<?> earth2=Class.forName("SingleEarth",true,cl2);*/


        Method getInstance1 = earth1.getDeclaredMethod("createInstance", null);
        Method getInstance2 = earth2.getDeclaredMethod("createInstance", null);

        Object singleton1 = getInstance1.invoke(null);
        Object singleton2 = getInstance2.invoke(null);

        System.out.println("singleton1--->"+singleton1);
        System.out.println("singleton2--->"+singleton2);

    }


}
