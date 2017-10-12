package practice.java8.lambdaexp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FlatMapTest {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2= Arrays.asList(7,8,9);
        List<Integer> list3= Arrays.asList(10,12,13,14);

        List<List<Integer>> lists = Arrays.asList(list1,list2,list3);

        Function<List<Integer>,Integer> sizeFunction = list->list.size();

        lists.stream()
                .map(l -> l.size())
                .forEach(System.out::println);

    }
}
