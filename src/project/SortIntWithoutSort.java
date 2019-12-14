package project;

import java.util.Arrays;

public class SortIntWithoutSort {
    public static void main(String[] args) {
          int []arr= {6,5,7,8,9,3,8}; //5 7
        //6,5,7,8,9,3,8
        //5,6,7,8,3,8,9 j=0
        //

        System.out.println(Arrays.toString(sorts(arr)));

    }
   public static int [] sorts(int[] array) {
       int temp =0;
       for (int j=0; j<array.length-1; j++){
       for (int i=0; i<array.length-1; i++){ //arr[0]=6, arr[1]=5, temp=0
           if(array[i]>array[i+1] ){   //6>5
               temp = array[i+1];      //arr[0]=6, arr[1]=5, temp=5
               array[i+1] = array[i]; //arr[0]=6, arr[1]=6, temp=5
               array[i]=temp;         //arr[0]=5, arr[1]=6, temp=5
           }
       }
       }
       return array;
   }
}
