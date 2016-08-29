package practice.algorithms;

import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        System.out.println("dUPLICATES --------->"+findDuplicates(numbers));



       }

    private static Set<Integer> findDuplicates(List<Integer> numbers) {
        Set<Integer> set1= new HashSet<Integer>();
        Set<Integer> set2= new HashSet<Integer>();

        for(Integer number:numbers){
            if(!set1.add(number)){
                set2.add(number);
            }
        }
        set2.retainAll(set1);

        return set1;
    }
}
