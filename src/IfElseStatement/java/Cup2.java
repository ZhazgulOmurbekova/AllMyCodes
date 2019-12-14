package IfElseStatement.java;

import java.util.Scanner;

public class Cup2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter 5 integers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();
        int evens = 0;
        int odd =0;

        if(number1 %2==0){
         evens++;
        }
        else {
           odd++;
        }
        if(number2 %2==0){
          evens++;
        }
        else {
            odd++;
        }
        if(number3 %2==0){
           evens++;
        }
        else {
            odd++;
        }
        if(number4 %2==0){
            evens++;
        }
        else {
            odd++;
        }
        if(number5 %2==0){
          evens++;
        }
        else {
           odd++;
        }
        System.out.println();
    }
}
