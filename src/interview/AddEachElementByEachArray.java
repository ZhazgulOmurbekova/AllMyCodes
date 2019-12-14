package interview;

import java.util.Arrays;

public class AddEachElementByEachArray {
    public static void main(String[] args) {
        int [] num1 = {1,2,4,5,6,7};
        int [] num2 = {1,2,4,5,6,7};
        //int length=

        int []newArr = new int[num1.length];
        for (int i =0; i < newArr.length; i++){
            if (i < num1.length){
                newArr[i] += num1[i];

            }if (i < num2.length){
                newArr[i]+=num2[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
