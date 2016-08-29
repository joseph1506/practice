package practice.algorithms;

import java.util.Scanner;

public class LeftRotationArray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int size= in.nextInt();
        int nOfR= in.nextInt();
        int[] numbers= new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=in.nextInt();
        }

        /*for(int number:numbers){
            System.out.println(number);
        }*/
        for(int i=0;i<nOfR;i++){
            leftRotationByOnePos(numbers,size);
        }

        for(int number:numbers){
            System.out.println(number);
        }
    }

    private static void leftRotationByOnePos(int[] numbers, int size) {
        int temp=numbers[0];
        for(int i=0;i<size-1;i++){
           numbers[i]=numbers[i+1];
        }
        numbers[size-1]=temp;

    }
}
