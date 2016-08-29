package practice.coreJava;

/**
 * Created with IntelliJ IDEA.
 * User: 606759708
 * Date: 17/07/14
 * Time: 15:44
 * To change this template use File | Settings | File Templates.
 */
public class TestTriplet {

     public static void main(String args[]){
        int firstNumber,secondNumber,thirdnumber,sum;
         int[] arrayInput={0,1,2,3,-2,-5};
         boolean found=false;



         for(int i=0;i<arrayInput.length;i++){
             firstNumber=   arrayInput[i];
             for(int j=0;i<arrayInput.length;j++){
                 if(j==i){
                     continue ;
                 }
                 secondNumber= arrayInput[j];
                 for(int k=0;k<arrayInput.length;k++){
                     if(k==i || k==j){
                         continue;
                     }
                     thirdnumber= arrayInput[k];
                     sum=firstNumber+secondNumber+ thirdnumber;
                     if(sum==0)        {
                         found=true;
                         break;
                     }
                 }
                 if(found) break;
             }
             if(found) break;
         }


     }
}
