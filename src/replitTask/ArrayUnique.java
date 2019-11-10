package replitTask;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUnique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr ={1, 1, 2, 3, 4, 3, 4}; //{input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int res=0;
        //TODO: write your code below
        Arrays.sort(arr);
        for (int i = 0, max = arr.length - 1; i < max; i += 2)
            if (arr[i] != arr[i + 1])
                System.out.println(arr[i]);
       // System.out.println(arr[arr.length - 1]); // Single element is the last
    }


}
