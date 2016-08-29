package practice.statics;

public class StaticsInitializers {
    private int number;

    public StaticsInitializers(int number) {
        this.number = number;
        System.out.println("Inside argument constructor");
    }

    public StaticsInitializers() {
        System.out.println("Inside default constructor");
    }

    {
        System.out.println("Inside first initializer block");
        System.out.println(this);
    }

    static {
        System.out.println("Inside first static block");
    }

    {
        System.out.println("Inside second initializer block");
        System.out.println(this);
    }

    static {
        System.out.println("Inside second static block");
    }

    public static void main(String args[]){
        System.out.println("Inside static method block");
        new StaticsInitializers();
        //new StaticsInitializers(7);
    }

}
