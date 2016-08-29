package practice.collections.Iterator;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.newLinkedList;

public class TestIterator {

      public static void main(String args[]){

          List<Integer> numbers=newArrayList();
          numbers.add(1);
          numbers.add(2);
          numbers.add(3);
          numbers.add(4);
          numbers.add(5);
          numbers.add(6);
          numbers.add(7);
          numbers.add(8);

          numbers.add(3,23);

          System.out.println("numbers--->");
          for(int iCount=0;iCount< numbers.size();iCount++){
              System.out.println("iCount--->"+iCount+"---->number---->"+numbers.get(iCount));
          }

          List<Integer> linkedNumbers=newLinkedList();
          linkedNumbers.add(1);
          linkedNumbers.add(2);
          linkedNumbers.add(3);
          linkedNumbers.add(4);
          linkedNumbers.add(5);
          linkedNumbers.add(6);
          linkedNumbers.add(7);
          linkedNumbers.add(8);
          linkedNumbers.add(3,23);

          System.out.println("linkedNumbers--->");
          for(int iCount=0;iCount< linkedNumbers.size();iCount++){
              System.out.println("iCount--->"+iCount+"---->linkedNumber---->"+linkedNumbers.get(iCount));
          }
      }


}
