package mockInterview;

import java.util.Arrays;

public class ReversIntArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        revers(arr);

    }
    public static void revers(int [] arr ){

        for (int i = 0; i < arr.length/2; i++) {
          int   temp =  arr[i];
            arr[i]  = arr[arr.length-1-i] ;
            arr[arr.length-1-i] = temp;


        }
        System.out.println(Arrays.toString(arr));

    }
}
