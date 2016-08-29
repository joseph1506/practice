package practice.datastructure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HourGlassComputation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        int maxSum=0;

        int iCount=0;int jCount=0;
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
               int sum=getSum(arr,i,j);
               if(i==0 && j==0){
                    maxSum=sum;
                }else if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
    }

    private static int getSum(int[][] arr, int iStart, int jStart) {
        int sum=0;
        for(int i=iStart;i<=iStart+2;i++){
            for(int j=jStart;j<=jStart+2;j++){
                if(i==iStart+1 && j==jStart+1){
                   sum=sum+arr[i][j];
                }else if(i!=iStart+1){
                    sum=sum+arr[i][j];
                }

            }
        }
        return sum;
    }
}
