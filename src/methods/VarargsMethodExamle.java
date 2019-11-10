package methods;

import java.util.Arrays;

public class VarargsMethodExamle {
    public static void main(String[] args) {
        maxNumber(3,4,5,6,6,6,34,545,354);
    }


    public static void maxNumber(int ... arr) {
        Arrays.sort(arr);
        System.out.println("the biggest number is "+ arr[arr.length-1]);

    }
}
