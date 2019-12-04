package interview;

import java.util.Arrays;

public class ReversInt {
    public static void main(String[] args) {
        int []arr = {4, 3, 2, 44, 1, 100, 55};

        for (int i =0 ; i < arr.length/2; i++){
            int temp= arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]= temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
