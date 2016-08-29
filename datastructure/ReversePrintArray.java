package practice.datastructure;

import java.util.Scanner;

public class ReversePrintArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int numbers[]= new int[n];
        for(int i=0;i<n;i++){
            numbers[i]=in.nextInt();
        }
        String output="";
        for(int i=n-1;i>=0;i--){
            output=output+numbers[i]+" ";
        }
        System.out.println(output.trim());
    }
}
