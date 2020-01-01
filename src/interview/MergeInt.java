package interview;

import java.util.Arrays;

public class MergeInt {
    public static void main(String[] args) {
         int [] num1 = {1,2,4,5,6,7};
        int [] num2 = {8,9,10,11,12};
       //int length=

      int []newArr = new int[num1.length+num2.length];
         int count=0;
        for (int i = 0; i < newArr.length; i++) {
            if(i < num1.length){
                newArr[count] = num1[i];
                count++;
            }if(i < num2.length){
                newArr[count] = num2[i];
                count++;
            }


        }

        System.out.println(Arrays.toString(newArr));

//        for (int element: num1){
//           // for (int elem2 : num2){
//
//
//                newArr[count] = element;
//                count++;
//     }for (int elem2: num2){
//                newArr[count]=elem2;
//               count++;
//        }//}
       // System.out.println(Arrays.toString(newArr));




    }
}
