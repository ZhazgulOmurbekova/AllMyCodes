package arrayss;

import java.util.Arrays;

public class ArrayTaskDeclaer {
    public static void main(String[] args) {

        /* Declare and initialize double array for prices.
Store following prices:
45.99, 23.5, 11.50, 33.33, 99.99.
Print the values then change the last element to 112.89.
Print all values again*/
//        String []names =new String[3];
//        System.out.println(Arrays.toString(names));

        double []arr={45.99, 23.5, 11.50, 33.33, 99.99};
        System.out.println(Arrays.toString(arr));
        arr[arr.length-1]=122.89;

        System.out.println(Arrays.toString(arr));
    }
}
