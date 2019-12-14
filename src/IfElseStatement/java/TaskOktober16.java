package IfElseStatement.java;

import java.util.Scanner;

public class TaskOktober16 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Enter your age ");
        int age = scanner.nextInt();
        if (age <0 || age >100){
            System.out.println("Invalid age ");
        }
        else if (age >=30){
            System.out.println("Welcome");
        }
        else {
            System.out.println("Try again ");
        }



    }
}
