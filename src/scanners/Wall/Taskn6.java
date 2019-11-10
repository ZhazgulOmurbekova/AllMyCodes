package scanners.Wall;

import java.util.Scanner;

public class Taskn6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in );
//7Write a program what asks the user to enter two decimal numbers.
// Take these two numbers and perform all the mathematical operations
// (+,-, *, /, %) on them. Print all the results. > input 3.5, 6 > output:
// Addition: 9.5 etc for Subtraction, Multiplication, Division, Remainder

       Scanner input =new  Scanner (System.in);
       int one = input.nextInt();
       double one1 = input.nextDouble();
        System.out.println(one+one1);
        System.out.println(one-one1);
        System.out.println(one*one1);
        System.out.println(one/one1);
        System.out.println(one%one1);

    }
}
