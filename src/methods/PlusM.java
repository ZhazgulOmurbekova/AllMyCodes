package methods;

import java.util.Scanner;

public class PlusM {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        plus_minus(arr);
    }


    // Create a method here and call it "plus_minus"


    public static int[] plus_minus(int[] nums) {

        int positive = 0;
        int  negative=0;
        int zero=0;
        for (int num : nums) {

            if (num > 0) {
                positive++;
                System.out.println("positive: "+positive);
            } else if (num < 0) {
                negative++;
                System.out.println("negative: "+ negative);
            } else if (num == 0) {
                zero++;
                System.out.println("zero: "+zero);
            }



        }

      return nums;
    }
}