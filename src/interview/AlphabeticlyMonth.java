package interview;

import java.util.Arrays;

public class AlphabeticlyMonth {
    public static void main(String[] args) {
String [] arr = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1] = temp;

                }




            }

        }     System.out.println(Arrays.toString(arr));
    }
}
