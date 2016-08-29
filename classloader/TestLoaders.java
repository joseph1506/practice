package practice.classloader;

public class TestLoaders {

    public static void main(String args[]) throws ClassNotFoundException {
        System.out.println("TestLoaders class loader-->"+TestLoaders.class.getClassLoader());
        System.out.println("TestLoaders class loader parent-->"+TestLoaders.class.getClassLoader().getParent());

        Class.forName("practice.classloader.TestLoaders",true,TestLoaders.class.getClassLoader().getParent());


    }
}
