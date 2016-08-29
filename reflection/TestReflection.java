package practice.reflection;

import practice.serialization.Badge;
import practice.serialization.DeSerializeDemolitionMan;
import practice.serialization.DemolitionMan;
import practice.serialization.SerializeDemolitionMan;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException {
        SerializeDemolitionMan sdm=null;

        System.out.println(DemolitionMan.class.getName());
        DemolitionMan dm = new DemolitionMan(new Badge("buhhahahah","973175"));
        ClassLoader classLoader=ClassLoader.getSystemClassLoader();
        //String classNameToBeLoaded="practice.serialization.SerializeDemolitionMan";

        Class serializeDMClass=SerializeDemolitionMan.class;
        Object instance=serializeDMClass.newInstance();
        Method serialize=serializeDMClass.getMethod("serialize", new Class[]{DemolitionMan.class});
        serialize.invoke(instance,new Object[]{dm});

        Class deserializeDMClass= DeSerializeDemolitionMan.class;
        Object deserializeInstance=deserializeDMClass.newInstance();
        Method deserialize=deserializeDMClass.getMethod("deserialize");
        DemolitionMan dmAfter =(DemolitionMan)deserialize.invoke(deserializeInstance);
        System.out.println("Name---->"+dmAfter.getBadge().getName());
        System.out.println("Id---->"+dmAfter.getBadge().getId());
    }
}
