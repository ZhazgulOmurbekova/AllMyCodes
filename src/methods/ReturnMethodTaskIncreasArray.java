package methods;

import java.util.Arrays;

public class ReturnMethodTaskIncreasArray {
/*Create a method that will take a String array and a String.
Increase your array capacity and add the given String as the
last element of the new array. Return the new array
 */

public static void main(String[] args) {
    String [] arr= {"a", "e", "i", "o"};
    System.out.println(Arrays.toString(increaseArray(arr,"u")));
}
public static String []increaseArrayWithClass(String [] arr, String word ){
    String []newArray = Arrays.copyOf(arr, arr.length+1);
    newArray[newArray.length-1] = word;
    return newArray;
}





    public static String [] increaseArray(String []arr, String word) {
        String [] newArr= new String [arr.length+1];
        for (int i =0; i< arr.length;i++){
            newArr [i]= arr[i];

        }
newArr[newArr.length-1]=word;
        return newArr;


    }
}
