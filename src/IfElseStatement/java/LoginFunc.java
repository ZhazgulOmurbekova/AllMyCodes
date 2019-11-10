package IfElseStatement.java;

import java.util.Scanner;

public class LoginFunc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       String userName =  "Zhazgul";
        String password =   "123456";
        System.out.println("Please inter your uname ");

        String enteruserName =   input.nextLine();


        if (enteruserName.equals(userName)){
            System.out.println("Please enter your password:");
            String enteredPass = input.nextLine();
            if (enteredPass.equals(password)) {
                System.out.println("Login Successful");
            }

            else  {
                System.out.println("Wrong password");
            }
        }
         else {
            System.out.println("Invalid username . ");
        }



    }
}
