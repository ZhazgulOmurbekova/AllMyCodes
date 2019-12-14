package interview;

import java.util.Arrays;

public class FindTheMinNumber {
    public static void main(String[] args) {
        int []arr = {20,10, 20, 500, 200, 300};
       int min = arr[0];

       for (int i = 0; i < arr.length; i++){
           if (arr[i] < min){
               min = arr[i];

           }
       }

        System.out.println(min);

        System.out.println("--------------");

      Arrays.sort(arr);
        System.out.println("Min "+arr[0]);
        System.out.println("Max "+ arr[arr.length-1]);
    }
}
