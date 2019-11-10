package loopsN;

import java.util.Scanner;

public class LoopsTaskHiBye {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Write a program that asks from the user infinitely:
        if user enters "hi" your program answers "hello", if user enters "bye" your program says "good bye"
          Flow:
         > hi
         Hello
         > bye
         Good bye
          > james
         Good bye*/

       for (int i = 0;i<3 ; i++) {
           String name = input.nextLine();

           if (name.equalsIgnoreCase("hi")){
               System.out.println("Hello");}

       else if (name.equalsIgnoreCase("bye")){
            System.out.println("Good bye");

        }
       else {
            System.out.println("Bye forever");
        }
        }
    }}

