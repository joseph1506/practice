package practice.coreJava;


public class TestException {
    public static void main(String[] args) {
        System.out.println(testMethod());
    }

    public static boolean testMethod(){
        try{
            throw new Exception("New");
        }catch(Exception e){
            throw e;
        }
        finally{
            return true;
        }
    }

}
