package project;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int []arr= {4,5,7,8,9,3,8};

        System.out.println(Arrays.toString(sorts(arr)));


    }public static int [] sorts(int[] array){
    int []sort = new int[array.length];
    int max = array[0];
for (int i=0; i<array.length; i++){
        if(array[i]>max && i!=array.length-1){
            sort[i] = array[i];}
    }
return sort;
}
}
