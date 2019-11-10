package switchStatement;

import java.util.Random;
import java.util.Scanner;

public class SwitchTask {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter the num");

        int rnum1 = random.nextInt(10);
        rnum1++; // his is how I get the range to be 1-10
        int gnum2 = scanner.nextInt();
        System.out.println("The random num is "+ rnum1);
        if (rnum1==gnum2){
            System.out.println("Congrats you guessed right");
        }
        else if (rnum1< gnum2) {
            System.out.println("your guess is too high");

        }
        else if (rnum1>gnum2){
            System.out.println("your guess it too low");
        }
        else {
            System.out.println();
        }



        }

    }

