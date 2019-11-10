package loopsN.Whilel;

import java.util.Scanner;

public class WhilesExam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter name ");

        String name = input.nextLine();


        while (name.startsWith("j")){
            System.out.println("Enter name ");
            name= input.nextLine();
        }
    }
}
