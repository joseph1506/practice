package practice.exception;

public class TestExceptionHandling {
    public static void main(String args[]){
          int count=0;

        try{
            int result =2/count;

        }/*catch (ArithmeticException ae){

            System.out.println("Arithmetic Exception");
        }catch(RuntimeException rte){
            System.out.println("Runtime Exception");
        }*/catch(Exception e){

            System.out.println("Exception block");
            try{
            throw new CustomException("Custom Exception",e);
            }catch(Exception ex){
                ex.printStackTrace(System.out);
                System.out.println("-----------------Cause of Exception----------------");
                ex.getCause().printStackTrace();

            }
        }catch(Throwable thr){
            System.out.println("Inside Throwable");
        }

        foo();

    }

    public static void foo() throws NullPointerException{

    }

}
