package IfElseStatement.java;

import java.util.Scanner;

public class Cup3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter 3 num");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 >num2 && num1>num3 ){
            System.out.println("MAx number is:"+ num1);
        }
        else if (num2 > num1 && num2>num3) {
            System.out.println("max  num is :"+ num2);
        }
       else  if (num3 > num1 && num2 > num3 ){
            System.out.println("max num is "+ num3 );
        }
        else if (num1 == num2 && num1 == num3 ) {
            System.out.println("All num are equal");
        }
    }
}
