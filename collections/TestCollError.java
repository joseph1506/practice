package practice.collections;

import com.google.common.base.Function;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.transform;

public class TestCollError {


    public static void main(String[] args){
        MapKeyObject map1=  new MapKeyObject(1,"1");
        MapKeyObject map2=  new MapKeyObject(2,"2");

        List<MapKeyObject> dummy=newArrayList();
        dummy.add(map1);
        dummy.add(map2);

        List<MapKeyObject> mapList=getMapList(dummy);

        MapKeyObject map3=  new MapKeyObject(3,"3");
        List<MapKeyObject> dummy2=newArrayList();
        dummy2.add(map3);

        List<MapKeyObject> mapList2= getMapList(dummy2);

        mapList.addAll(mapList2);



    }

    private static List<MapKeyObject> getMapList(List<MapKeyObject> dummy) {
        return transform(newArrayList(dummy), new Function<MapKeyObject,MapKeyObject>() {
            @Override
            public MapKeyObject apply(MapKeyObject input) {
                return input;
            }
        });
    }

}
