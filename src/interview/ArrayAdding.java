package interview;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayAdding {
    public static void main(String[] args) {
        int [] arr = {1,2,0,0};
        int [] arr1 = {3,1,4,9};

        System.out.println(Arrays.toString(addToArray(arr,23)));

        System.out.println(Arrays.toString(addToArray(arr1,10000)));

    }





    public static int [] addToArray(int [] nums, int addNum){
        String strNum = Arrays.toString(nums);
        strNum = strNum.substring(1, strNum.length()-1);
        strNum = strNum.replace(",","").replace(" ","");
        int number = Integer.parseInt(strNum) + addNum;
        strNum = String.valueOf(number);
        int [] finished = new int [strNum.length()];
        for (int i = 0; i < finished.length; i++) {
            finished[i] = Integer.parseInt(strNum.charAt(i)+"");


        }

      return finished;
    }


}
