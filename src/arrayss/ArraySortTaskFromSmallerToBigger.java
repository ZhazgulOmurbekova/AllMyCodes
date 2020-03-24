package arrayss;

import java.util.Arrays;

public class ArraySortTaskFromSmallerToBigger {
    public static void main(String[] args) {
        /*Given an array with the value of: 31, 20, 25, 20, 3, 48, 26, 12
Print out the biggest and smallest values in the array */

        int []numbers ={31, 20, 25, 20, 3, 48, 26, 12};

       // System.out.println(numbers[0]);

       // System.out.println(numbers[0]);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("biggest"+ numbers[numbers.length-1]);
        System.out.println("Smaller"+ numbers[0]);

        System.out.println(Arrays.toString(numbers));
    }
}
