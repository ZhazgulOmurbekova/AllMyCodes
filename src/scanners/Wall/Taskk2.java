package scanners.Wall;

import java.util.Scanner;

public class Taskk2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in );

        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int count = 0;


        int result = one+two; // increase 1st time
        count++;
//2
        System.out.println("Your number is: " +  result+ " after being incremented by " + two + " " + count + " times");
        result  = result + two; // increase 2nd time
        count++;
        System.out.println("Your number is: " +  result + " after being incremented by " + two + " " + count + " times");
        result = result + two; //increase 3rd time
        count++;
        System.out.println("Your number is: " +  result + " after being incremented by " + two + " " + count + " times");
    }
}
