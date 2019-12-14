package loopsN;

import java.util.Scanner;

public class LoopsPasswordTask {
    public static void main(String[] args) {

        String password = "secret478";
        Scanner input = new Scanner(System.in);

        for (int attempts=0; ;attempts++ ) {

            if (attempts==3){
                System.out.println("Your account is locked");
                break;
            }


            System.out.println("Pleas enter your Password:");
            String ePass = input.nextLine();
            if (ePass.equals(password)) {
                System.out.println("Welcome");
                break;
            }
//
            else{
                    System.out.println("not right password");
                    continue;
                }

        }
    }}
