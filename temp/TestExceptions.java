package practice.temp;


public class TestExceptions {


    public String getName(){

        try{
            throw new Exception("");
           //return "in try";

        }catch(Exception e){
           return "in Exception";
        }finally {
            return "in finally";
        }

        /*return "after finally";*/

    }

    public static void main(String args[]){
        System.out.println(new TestExceptions().getName());
    }

}
