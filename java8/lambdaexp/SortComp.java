package practice.java8.lambdaexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortComp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Angel");
        names.add("Joseph");
        names.add("Antony");
        names.add("Lazy");
        names.add("Bllazy");
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return  name1.compareTo(name2);
            }
        };

        Comparator<String> comparatorlamBda = (name1, name2) ->
                                                        name1.compareTo(name2);
        Collections.sort(names,comparatorlamBda);
        for(String name:names){
            System.out.println("name-->"+name);
        }

    }
}
