package arrayss;

import java.util.Arrays;

public class ArraySortExampl {
    public static void main(String[] args) {
        String [] arr ={"z", "a", "e" };
        System.out.println(arr[0]);

        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
    }
}
