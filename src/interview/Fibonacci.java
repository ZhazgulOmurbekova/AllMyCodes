package interview;

import java.util.Arrays;

public class Fibonacci {
    /*Create a method that will accept a number (int). Return a String with each Fibonacci number separated by a space.
    The amount of Fibonacci numbers in the String is determined by the given numberEx: > input: 10 > output: 0 1 1 2 3 5 8 13 21 34
     */
    public static void main(String[] args) {
        //fibonacci(10);
      //  fibonacci1(15);
        System.out.println(fibonacci(11));

    }
    public static String  fibonacci1(int num){
        int [] arr = new int [num];
        arr[0] =0;
        arr[1] =1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];

        }return Arrays.toString(arr).replace("[", "").replace("]", "").replace(",", "");
    }



    public static String  fibonacci(int num){
        String a = "";
        System.out.println();
        int num1=0;
        int num2=1;
        for(int i=0; i<num; i++){
          //  System.out.print(num1 + "  ");
            a += num1;
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
           // a = num +"";
        }return a;
    }
}
