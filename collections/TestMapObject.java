package practice.collections;

import java.util.Map;

import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Maps.newTreeMap;

public class TestMapObject {

    public static void main(String args[]){
        MapKeyObject key1= new MapKeyObject();
        key1.setX(20);
        key1.setY("Twenty");

        MapKeyObject key2= new MapKeyObject();
        key2.setX(21);
        key2.setY("Twenty One");

        MapKeyObject key3= new MapKeyObject();
        key3.setX(22);
        key3.setY("Twenty two");

        Map<MapKeyObject,String> hashMap= newHashMap();
        hashMap.put(key3,"22");
        hashMap.put(key1,"20");
        hashMap.put(key2,"21");

        Map<MapKeyObject,String> hashMapTree= newTreeMap();
        hashMapTree.put(key3,"22");
        hashMapTree.put(key1,"20");
        hashMapTree.put(key2,"21");
        System.out.println("Just For check");

    }


}
