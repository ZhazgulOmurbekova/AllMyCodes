package methods;

import java.util.Scanner;

public class MethodArrayFindSecondString {
    public static void main(String[] args) {
        /*Write a method that takes two Strings. Check if the second String is found inside of the first String.
         If it does, remove that part from the String,
         but if the second String is not in the first String ask the user to enter another String to try again.
         */

    }

    public static void checkStr(String one , String two,boolean bool) {
        if (one.contains(two)){
            one.replace(two,"");
            System.out.println(one.trim());


        }else {
            System.out.println("Try again");
            Scanner input = new Scanner(System.in);
            String again = input.nextLine();

            if (one.contains(again)){

            }else {
                System.out.println("Out of Tries");
            }
        }

    }


}
