package practice.collections;

import com.google.common.collect.ImmutableList;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import static com.google.common.collect.Lists.newArrayList;

public class TestCollectionsImmutability<E extends Number> {

    int i=10;
    private E[] arrayOfE= (E[]) new Number[10];

    public void addNumber(E number){
           arrayOfE[0]= number;
            arrayOfE[1]= number;
    }





    public static void main(String args[]){
        List<TestObject> objectList= newArrayList();
        for(int i=0;i<10;i++){
            TestObject test = new TestObject();
            test.setObjectName("Obj"+i);
            objectList.add(test);
        }

        List<TestObject> unmodifiableList= Collections.unmodifiableList(objectList);
        List<TestObject> immutableList= ImmutableList.copyOf(objectList);
        objectList.remove(2);
        System.out.println("for test");
        unmodifiableList.get(unmodifiableList.size());
        int lastindex=unmodifiableList.lastIndexOf(unmodifiableList.get(unmodifiableList.size()));
        ListIterator<TestObject> iterator=unmodifiableList.listIterator();


        /*while(iterator.hasNext()){
            TestObject testObject=iterator.next();
            iterator.remove();
        }*/
        /*System.out.println("Name-->"+immutableList.get(2).getObjectName());
        objectList.get(2).setObjectName("Name changed");

        System.out.println("Name-->"+immutableList.get(2).getObjectName());

        immutableList.remove(0);*/
        //immutableList.add(new TestObject());

        //unmodifiableList.remove(0);
        //unmodifiableList.add(new TestObject());
        TestCollectionsImmutability<Integer> testCollectionsImmutability= new TestCollectionsImmutability();
        testCollectionsImmutability.addNumber(123);

    }

}


class TestObject{
    private String objectName;

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
}
