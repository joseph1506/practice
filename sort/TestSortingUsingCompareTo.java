package practice.sort;

import java.util.Collections;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class TestSortingUsingCompareTo {

    public static void main(String args[]){
        List<Car> cars= newArrayList();
        cars.add(new Car("Ferrari",2000,120));
        cars.add(new Car("BMW",1800,110));
        cars.add(new Car("Lamborgini",2500,115));
        cars.add(new Car("Maruti800",800,60));
        cars.add(new Car("HondaCity",1500,90));
        cars.add(new Car("RangeRover",2500,130));
        cars.add(new Car("Hummer",3500,100));
        System.out.println("Before Sort---------->");

        for(Car car:cars){
            System.out.println(car.toString());
        }
        Collections.sort(cars);

        System.out.println("after Sort---------->");

        for(Car car:cars){
            System.out.println(car.toString());
        }
    }
}
