package practice.casting;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class TestCasting {

    public void main(String args[]){
        List<Animal> animals=newArrayList();
        Animal genericAnimal= new Animal();
        Dog dog= new Dog();
        Lion lion = new Lion();

        animals.add(genericAnimal);
        animals.add(dog);
        animals.add(lion);

        Lion lionCast= (Lion)animals.get(2);
        lionCast.killOthers();

    }


}
