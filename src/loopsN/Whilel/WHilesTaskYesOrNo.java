package loopsN.Whilel;

import java.util.Scanner;

public class WHilesTaskYesOrNo {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter");

        /* Create a program that will continue to add 1 to a number if the user keeps entering “y” or “yes” Number will start at 0.
        When the user enters “n” or “no” Print out the final number.
Flow:
Would you like to add 1?
> y
Would you like to add 1?
> y
Would you like to add 1?
> y
Would you like to add 1?
> n
Your number is: 3*/

        String check =in.nextLine();
        String no = "n";
        int numm = 0;

        while (check.equals("yes")|| check.equals("y")){
            numm++;
            System.out.println("Enter");
            check=in.nextLine();
        }
        System.out.println("Your num is "+numm);


    }
}
