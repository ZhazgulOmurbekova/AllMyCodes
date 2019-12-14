package nestedLoops;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class NestedTaskNum100To200 {
    public static void main(String[] args) {
        /*Write a program that will ask the user to enter two numbers.
        The first number will be the starting value for your range.
         The second number will be the ending number of your range.
          Add up the sum of all the numbers in your range and print
          “The some of num1 to num2 is: sumAllValue”
           > input: 1, 100
          > output: “The some of 1 to 100 is: 5050”*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number ");

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int sum =0;

        //double avg= number2-number1;

        for (int i = number1; i<= number2;i++){
            sum+=i;

        }
        System.out.println("The sum of "+number1+ " to "+ number2+ " is "+ sum);
        System.out.println();

    }
}
