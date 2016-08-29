package practice.exception;

public class TestError {

    public static void main(String args[]){
        try{
            int i=2/0;

        }catch(Exception e){
            System.out.println("inside catch");
            System.exit(1);

        }finally {
            System.out.println("inside finally");
        }




    }

}
