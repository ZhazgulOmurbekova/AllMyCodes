package exception;

import java.util.Scanner;

public class Excep {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter the number ");
            int num1 = input.nextInt();
            System.out.println("enter second number ");
            int num2 = input.nextInt();
        }catch (Exception e ){
            System.out.println("Invalid num ");
        }


    }
}
