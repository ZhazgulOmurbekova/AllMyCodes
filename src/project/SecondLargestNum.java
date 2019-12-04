package project;

public class SecondLargestNum {
    public static void main(String[] args) {
        /**
         * The method takes integer of array as an argument and returns second larges number of integer from
         * that array.
         * @param arr
         * @return num
         * @see [3, 6, 1, 8, 9, 9, 10, 10, 10] => 9
         * */

        // Required! Method name is: secondLargestNum(int[] arr)
        int [] arr= {12,23,99,3,5,89,100,100};
        System.out.println(secondLargestNum(arr));
    }

    public static int secondLargestNum(int[] arr) {
        int first = 0;
        int biggest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                biggest = first;
                first = arr[i];
            }
        }
        return biggest;
    }
}

