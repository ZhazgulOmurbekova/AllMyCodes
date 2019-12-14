package loopsN;

import java.util.Scanner;

public class LoopsTaskPrintName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Write a program that asks from 5 names from the user and print each name.
       Flow:
          Please enter name1:
        > Adam
        Adam
        Please enter name2:
         > Jamie
         Jamie
         Please enter name3:
         > John
          John*/


        for (int i = 0; i <= 5; i++ ){
            System.out.println("Enter the word:");

            String name1 = input.nextLine();

            System.out.println(name1 );
        }



    }
}
