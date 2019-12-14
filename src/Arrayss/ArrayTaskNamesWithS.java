package Arrayss;

import java.util.Scanner;

public class ArrayTaskNamesWithS {
    public static void main(String[] args) {
        /*4) Create String array for students. Initialize with students below:
         James, John, Adam, Elize, Jamie, Benzema
Loop through each elements of students. - print first character of each name on each line.
- Part II * Modify the loop and print the player names whose name ends with "s";
- Part III * Modify and print the player if it contains "s"
Part IV * Read the String from the user using Scanner and print out the players that contains
the entered String keyword by user*/
        String []students = {"James", "John", "Adam", "Elize", "Benzema"};
//        String student = "";

        for (int i =0; i <students.length; i++){
   int last = students[i].length()-1;
            System.out.println(students[i].charAt(last));
        }
        for (int i =0 ; i < students.length;i++){
            if (students[i].toLowerCase().endsWith("s")){
                System.out.println(students[i]);
            }
        }
        System.out.println();
        System.out.println("Enter a string");
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();

        for(int i=0; i < students.length; i++) {
            if(students[i].toLowerCase().contains(user)) {
                System.out.println(students[i]);

            }}
    }
}
