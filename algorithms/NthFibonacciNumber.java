package practice.algorithms;

import java.util.Scanner;

public class NthFibonacciNumber {

    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner inputScan= new Scanner(System.in);
        Integer input=Integer.parseInt(inputScan.nextLine());

        System.out.println("Fib number-->"+getNthFib(input));
    }
    private static int getNthFib(int input) {
        if(input<=1){
            return input;
        }
        return getNthFib(input-1)+getNthFib(input-2);
    }
}
