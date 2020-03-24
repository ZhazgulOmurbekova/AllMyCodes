package interview;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallestAndBiggestNumInArray {


    public static void main(String[] args) {
        int []arr = {-500, -20, 30, 200, 300};

//        System.out.println(Arrays.toString(arr));
//
//        biggestAndSmallest(arr);
        biggestAndSmallest1(arr);
    }









    public static void biggestAndSmallest1(int [] arr){

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];

            }

            if(arr[i] < min){
                min = arr[i];

            }

        }   System.out.println(max);
        System.out.println(min);
    }


    public static void biggestAndSmallest12(int [] nums){
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for(int num : nums){
            if(num > big){
                big = num;
            }
            if(num < small){
                small  = num;
            }
        }

        System.out.println(big);
        System.out.println(small);

    }



}
