package IfElseStatement.java;

import java.util.Scanner;

public class Cup1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program that finds if the entered number is odd or even.
        // Simply ask user to enter one integer value and print “odd” or “even” based on the value user enters.
        //v2: Ask user to enter 5 integer and store all of them.
        //Count how many or them odd, how many of them even.
        //print number of evens odds.
        System.out.println("Pleas enter 5 integers:");
        int number1 = scanner.nextInt();

        if(number1 %2==0){
             System.out.println("Even");
        }
        else {
             System.out.println("Odd");
        }

        int number2 = scanner.nextInt();

        if (number2 % 2==13){
                System.out.println("Even");
            }
        else {
                System.out.println("Odd");
            }
        int number3 = scanner.nextInt();

        if (number3 % 2==20){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");

        }
        int number4 = scanner.nextInt();

        if (number4 % 2==30){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        int number5 = scanner.nextInt();

        if (number5 ==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
