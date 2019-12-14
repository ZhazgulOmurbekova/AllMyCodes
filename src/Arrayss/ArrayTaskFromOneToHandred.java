package Arrayss;

import java.util.Arrays;
import java.util.Random;

public class ArrayTaskFromOneToHandred {
    public static void main(String[] args) {
        /*6) Create an array with 50 random numbers in the range of 1-100. Then print the array*/

        Random random= new Random();

        int [] arr = new int [50];
       // int num= random.nextInt(100);


        for (int i = 0; i < arr.length; i++){
        arr[i]=random.nextInt(100)+1;





        }
        System.out.println(Arrays.toString(arr));
    }
}
