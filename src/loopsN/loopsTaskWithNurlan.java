package loopsN;

import java.util.Scanner;

public class loopsTaskWithNurlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        String answer = "";


        do {
            System.out.println("Pleas enter name");
            name = input.nextLine();
            System.out.println("Continue");
            answer = input.nextLine();


        } while (answer.equals("no")) ;



    }

}

