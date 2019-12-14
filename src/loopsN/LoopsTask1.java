package loopsN;

import java.util.Scanner;

public class LoopsTask1 {
    public static void main(String[] args) {
        /*Please write a program that asks the name from user using
         Scanner and print "Welcome, %name" for 15 times.*/
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();

        for (int i=0; i<15; i++){
            System.out.println(n+ " "+ i);
        }
        System.out.println();
        for (int i = 0 ; i < n.length();i++){
            System.out.println(n.charAt(i)+" for index " + i);
        }
    }
}
