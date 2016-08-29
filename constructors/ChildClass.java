package practice.constructors;

public class ChildClass extends ParentClass{
    public ChildClass() {
        System.out.println("Child Constructor");
    }

    public ChildClass(String name) {
        super(name);
        System.out.println("Child argument Constructor");
    }
}
