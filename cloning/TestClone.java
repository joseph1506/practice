package practice.cloning;

public class TestClone {


    public static void main(String[] args) throws CloneNotSupportedException {
          Person person= new Person();
          person.setName("Original");
          Features features= new Features();
          features.setHeight("6'11");
          features.setWeight("80kg");
          person.setPersonFeatures(features);

          Person newPerson=person.clone();

        System.out.println(person);
        System.out.println(person.getPersonFeatures());
        System.out.println(newPerson);
        System.out.println(newPerson.getPersonFeatures());

    }
}
