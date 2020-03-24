package array2Ds;

import java.util.Arrays;
import java.util.Random;

public class TwoArrayTAskHowManyElem {
    public static void main(String[] args) {
        /*Create a method that will generate a random 2D int array. Take two parameters.
        The first one for how many 1D arrays you want, and second how many elements each 1D array should have
         */
        System.out.println(Arrays.deepToString(creatRandom(4,5)));

    }

    public static int [][] creatRandom(int num1Arr, int num2Elem) {
       int [][]arr= new int [num1Arr][num2Elem];
        Random rendom = new Random ();

       for (int i=0; i<arr.length;i++){
           for (int j=0; j<arr[i].length;j++){
               arr[i][j]=rendom.nextInt(100);
           }
       }
           return arr;
    }
}
