package methods;

import java.util.Arrays;

public class MethodArrayTaskRepleceNegatNum {
    public static void main(String[] args) {
        /*Write a method accepts an int array and a number.
    Replace any negative numbers in your array with the given number. Print the array*/
        int [] arr2 = {-1, 3, -4, -2, 32, 2, -22, 1};
        changeNegatNum(arr2, 23);
       // System.out.println(Arrays.toString(arr2));

    }

    public static void changeNegatNum(int [] arr, int change) {
        for (int i =0; i<arr.length; i++){
            if (arr[i]<0){
                arr[i]= change;
                //System.out.println(num);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
