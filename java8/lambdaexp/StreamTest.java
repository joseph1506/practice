package practice.java8.lambdaexp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        Stream<String> streams = Stream.of("one","two","three","four","five","six","seven","eight");

        Predicate<String> p1= s-> s.length()>3;
        Predicate<String> p2 = Predicate.isEqual("two");
        Predicate<String> p3 = Predicate.isEqual("four");

        /*streams
                .filter(p1.or(p2))
                .forEach(s->System.out.println(s));*/

        List<String> numbers= new ArrayList<>();

        streams
               .peek(System.out::println)
               .filter(p1.or(p2))
               .forEach(numbers::add);

        System.out.println(numbers.size());
    }
}
