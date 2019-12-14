package strings;

import java.util.Scanner;

public class HomwStrin {
    public static void main(String[] args) {
        /* Credentials: Given two existing data: user and pass of “test” and “test123”
Write a program that asks users to enter a username and password.
—> If the username and password match print: “ Welcome!”
—> If username is incorrect print: “invalid username” and don’t ask for the password
—> If password is incorrect print: “invalid password”*/
        Scanner scanner = new Scanner(System.in);

        String userName = "test";
        String password = "test123";

        System.out.println("Enter your name ");
        String name = scanner.nextLine();

        if (name.equals(userName)){

              System.out.println("Enter your password ");
            String pass = scanner.nextLine();

            if (pass.equals(password)){
                System.out.println("Welcome");

            }
            else {
                System.out.println("The password is invalid");
            }
        }
        else {
            System.out.println("The username is invalid");
        }
    }

}
