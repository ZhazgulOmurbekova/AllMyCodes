package strings;

import java.util.Scanner;

public class AcNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        /* User is asked to enter an account number. You will check if these account numbers are valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
—> If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet
 the expected results print “ Invalid account number”
         */

        System.out.println("Enter ac num");
        //int acNum = input.nextInt();
        String acNum = input.nextLine();
        String firstNum = acNum.substring(0,1);

        boolean two = !firstNum.equals("5") || !firstNum.equals("2") ;

        if (two){
            System.out.println("invalid num");


        }
        else {
            System.out.println();
            if (firstNum.equals("5") && acNum.length()==10){
                System.out.println("Valid 5 account");
            }
            else {
                System.out.println("invalid 5 account");

            }
        }
    }
}
