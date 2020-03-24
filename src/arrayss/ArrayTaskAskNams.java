package arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTaskAskNams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.println("Enter 5 names: ");
        //String name = input.nextLine();
//        int size = input.nextInt();
//        input.nextLine();
        /*Write a program that will ask user to enter 5 names. Take each name and store all the names into an array. Print the array*/



        String [] names = new String [5];

        for (int i = 0; i < names.length; i++){
            System.out.println("Enter the name "+ (i+1));

            names[i] = input.nextLine();



        }

        System.out.println(Arrays.toString(names));



    }
}
