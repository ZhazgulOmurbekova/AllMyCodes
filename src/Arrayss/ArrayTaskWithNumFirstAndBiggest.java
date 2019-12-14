package Arrayss;

public class ArrayTaskWithNumFirstAndBiggest {
    public static void main(String[] args) {

        /*given number of 3,30,14,6,50,20 .Find and print the bigger number*/

        int[] arr= {3,30,14,6,50,20};
        int max =arr[0];

        for (int i =1; i < arr.length ;i++){
        if (arr[i]>max){
         max =arr[i];
       }

       }

        System.out.println(max);
    }
}
