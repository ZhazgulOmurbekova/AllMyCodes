package methods;

import java.awt.*;

public class Fibonacci {

    public static void main(String[] args) {
       beFibonacci(5);
       bFibonacci(4);
    }
    public static void beFibonacci(int n){
        int one = 0;
        int two = 1;

       // System.out.print(one + " ");

        for (int i = 0; i < n; i++) {
            System.out.print(one + " ");
            int result  = one + two;
           one = two;
           two = result;



        }

    } public static void bFibonacci(int n){
        System.out.println();
        int num1=0;
        int num2=1;
        System.out.print("The first " + n + " number of Fibonacci series are: ");
        //0 1 1 2 3 5
        for(int i=0; i<n; i++){
            System.out.print(num1 + " - ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
