package Arrayss;

import java.util.Arrays;

public class ArrayTaskSearchPrintNegativeArray {
    public static void main(String[] args) {
        /*1. declare array and store elements
{45,23,6,-3,66}
2. print out the index of -3 if it exists in the array.*/

        int []numbers={45,23,6,-3,66};
        int [] nums = {45,23,6,-3,66};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.binarySearch(nums, -3));

//        System.out.println("index of 2 is "+ Arrays.binarySearch(numbers,2));
//
//        for (int i=0; i<numbers.length; i++){
//            if (numbers[i]<0){
//                System.out.println("Index is negativ"+ numbers);

//            }
//        }
    }
}
