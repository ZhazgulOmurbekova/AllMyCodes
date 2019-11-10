package IfElseStatement.java;

import java.util.Scanner;

public class Cup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int userCode = 3241;
        System.out.println("Pleas enter pass code");
        int passCode = scanner.nextInt();
        if (passCode== userCode) {
            System.out.println("Welcome to iPhone");

        }
        else if (passCode<0){
            System.out.println("No Negative  number");
        }
        else if (passCode <1000){
            System.out.println("You entered less digits");
        }
        else if (passCode > 9999){
            System.out.println("You entered more digits");
        }

        else  {
            System.out.println("Try again");

        }
//        System.out.println("No Negative  number");
//        int passcode2 = 2345;
//        int passCode3 = scanner.nextInt();
//        if(passcode2 == passCode3) {
//            System.out.println();
//            System.out.println("You entered more digits");
//
//            }
//        else {
//            System.out.println();
//            System.out.println("You entered less digits");
//        }
    }
}
