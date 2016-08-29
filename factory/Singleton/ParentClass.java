package practice.factory.Singleton;

public class ParentClass implements Cloneable{
    private static final ParentClass parentClass= new ParentClass() ;

    private ParentClass(){
    }

    public static synchronized ParentClass getInstance(){
        return parentClass;
    }

    public void printClassLines(){
        System.out.println("Parent class");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
