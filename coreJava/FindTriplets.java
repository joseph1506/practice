package practice.coreJava;

/**
 * Created with IntelliJ IDEA.
 * User: 606852546
 * Date: 17/07/14
 * Time: 17:11
 * To change this template use File | Settings | File Templates.
 */
public class FindTriplets {
    int a[] ={1,6,-1,-3,4,5};

    boolean checkTriplet(int sum){
        int curr=0;
        int i=0,j=a.length-1;
        while(i<a.length && j>0){
            curr = a[i]+a[j];
            if(curr==sum)
                return true;
            if(curr>sum)
                j--;
            else
                i++;
        }
        return false;



    }
    void checkTripletUtil(){

        for(int i=0;i<a.length;i++){
            if(checkTriplet(-a[i])) {
                System.out.print("Its there");
                System.out.println(a[i]);
                break;
            }
        }
    }
    public static  void main(String a[]) {
        FindTriplets fr=new FindTriplets();
        fr.checkTripletUtil();

    }

}
