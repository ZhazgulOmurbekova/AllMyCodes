package interview;

import java.util.Arrays;

public class MergeInt {
    public static void main(String[] args) {
         int [] num1 = {1,2,4,5,6,7};
        int [] num2 = {1,2,4,5,6,7};
       //int length=

      int []newArr = new int[num1.length+num2.length];



int count=0;


        for (int element: num1){
                newArr[count] = element;
                count++;
//           }for (int element2: num2){
                newArr[count]=element;
               count++;
        }
        System.out.println(Arrays.toString(newArr));




    }
}
