package arrayss;

import java.util.Arrays;

public class ArraySearchingExample {
    public static void main(String[] args) {

        int [] number ={2, 5, 7, 14};
        System.out.println("index of 2 is "+Arrays.binarySearch(number,2));
        System.out.println("index of 7 is "+Arrays.binarySearch(number,7));
        System.out.println("index of 9 is "+Arrays.binarySearch(number,9));
        System.out.println("index of 15 is "+Arrays.binarySearch(number,15));
    }
}
