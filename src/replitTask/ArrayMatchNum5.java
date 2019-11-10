package replitTask;

import java.util.Scanner;

public class ArrayMatchNum5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        boolean check=false;
        for (int i=0; i<nums.length; i++){

            if (nums[i]==5){
                if (nums[i+1]==5){
                    System.out.println("true ");
                    check=true;
                    break;
                }
                else {
                    System.out.println("false");
                    check = false;
                }
            }else {
               check=false;
            }
        } System.out.println(check);
    }
}
