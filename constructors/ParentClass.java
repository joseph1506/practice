package practice.constructors;

public class ParentClass {
    protected String name;

    public ParentClass() {
        System.out.println("Parent Constructor");
    }

    public ParentClass(String name) {
        this.name=name;
        System.out.println("Parent argument Constructor");
    }

    public static void main(String args[]){
        ChildClass parent= new ChildClass("name");
    }
}
