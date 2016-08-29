package practice.generics;

import java.util.Iterator;
import java.util.List;

public class Adder {

    public int addAllNumbers(List<?> allNumbers){
        int total=0;
        Iterator iterator=allNumbers.iterator();

        while(iterator.hasNext()){
            int number= ((Integer)iterator.next()).intValue();
            total+=number;
        }
        return total;
    }

    public void justTest(List<Object> objectList){

    }

}
