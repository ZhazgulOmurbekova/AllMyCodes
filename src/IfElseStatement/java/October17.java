package IfElseStatement.java;

import java.util.Scanner;

public class October17 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if (first == second && third == second) {
            System.out.println("All integers are same");
        } else {
            System.out.println("The biggest number from " + first + ", " + second + " and " + third + " is: ");
            if (first > second && first > third) {
                System.out.println(first);
            } else if (second > first && second > third) {
                System.out.println(second);
            } else {
                System.out.println(third);
            }
        }
    }
}

