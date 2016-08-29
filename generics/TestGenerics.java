package practice.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {

    public static void main(String args[]){
        List<Integer> numbers= new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);

        Adder adder=new Adder();
        System.out.println("Total is --->"+adder.addAllNumbers(numbers));

        List<Object> objectList= new ArrayList<Object>();
        objectList.add(adder);


        List<Adder> list= new ArrayList<Adder>();
        list.add(adder);


    }


}
