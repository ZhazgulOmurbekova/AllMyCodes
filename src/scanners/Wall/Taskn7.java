package scanners.Wall;

import java.util.Scanner;

public class Taskn7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//8 Vending machine change.
// Write a program that will ask used to enter a whole number from
// 1 to 99. User will get back the amount of quarters,
// dimes, nickels, and pennies that are needed to equal
// to the provided number.
// > input Enter your change68 > outputYour change of 68
// was converted to:quarters: 2dimes: 1nickels: 1pennies: 3
          int change, remain, quarters, dimes, nickles, pennies ;


        System.out.println("G");
        change= input.nextInt();
       remain=change;// 68

        quarters = change/25;
        remain= remain % 25;

        dimes = remain / 10;
        int remain2 = remain % 10;

        nickles = remain2 / 5;
        int remain3 = remain2 % 5;
        pennies = remain3;
        System.out.println("Your change of " + change +  " was converted to ");
        System.out.println("Quarters " + quarters);
        System.out.println("Dimes "  + dimes);
        System.out.println("Nickles" + nickles);
        System.out.println("Pennies " + pennies);




    }
}
