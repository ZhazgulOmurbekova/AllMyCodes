package IfElseStatement.java;

import java.util.Scanner;

public class BiltCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Choose operators ");
        String operator = scanner.nextLine();


        if(operator.equals("*")){
            System.out.println("Result of " + num1 + operator + num2 + " is: " + (num1 * num2));
        }
        else if(operator.equals("-")){
            System.out.println("Result of " + num1 + operator + num2 + " is: " + (num1 - num2));
        }
        else if(operator.equals("+")){
            System.out.println("Result of " + num1 + operator + num2 + " is: " + (num1 + num2));
        }
        else if(operator.equals("/")){
            System.out.println("Result of " + num1 + operator + num2 + " is: " + (num1 / num2));
        }
        else {
            System.out.println("Invalid operator entered. Please try again!");
        }
    }
}





