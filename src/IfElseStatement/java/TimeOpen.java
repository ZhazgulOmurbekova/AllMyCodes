package IfElseStatement.java;

import java.util.Scanner;

public class TimeOpen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );

        System.out.println("Enter the time ");
        int time = input.nextInt();
         if (time < 0 || time>= 24) {
             System.out.println("Invalid time ");
         }
         else if (time>= 8 && time<=23){
             System.out.println("open");
         }
         else {
             System.out.println("close");
         }
    }
}
