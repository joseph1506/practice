package practice.generics;

import java.util.ArrayList;
import java.util.List;

public class MyOwnTesting {

    public static void main(String[] args) {
        List<Car> cars= new ArrayList<Car>();
        cars.add(new Astar());

    }
}

class Car{
}

class Astar extends Car{
}

class i20 extends Car{

}
