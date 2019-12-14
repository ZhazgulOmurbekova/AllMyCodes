package scanners.Wall;

import java.util.Scanner;

public class Taskn4 {
    public static void main(String[] args) {
//        5Write a program that will ask user to enter two characters.
//        Declare a boolean with the following value: charOne > charTwo.
//        Print the resulting boolean.
        Scanner in = new Scanner(System.in);

        System.out.println("Task 5");
        char char1 =in.nextLine().charAt(0);
        char char2 =in.nextLine().charAt(0);
        System.out.println(char1>char2);


    }
}
