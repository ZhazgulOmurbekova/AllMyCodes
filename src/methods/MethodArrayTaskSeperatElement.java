package methods;

import java.util.Arrays;

public class MethodArrayTaskSeperatElement {
    public static void main(String[] args) {
        /*Write a method that will take a String of numbers (9843263 for example) and an int.
        Add that second given number to each other number and show each operation
        result as separate elements of an int array
         */
        addNumToString("9843263",5);

    }

    public static void addNumToString(String num, int add) {
        //9843263
    String []arr = num.split("");

    int []intArray = new int [arr.length];
    for (int i =0; i<arr.length; i++){
        intArray[i] = Integer.valueOf(arr[i])+add;
    }
        System.out.println(Arrays.toString(intArray));
    }
}
