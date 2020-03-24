package exception;

import java.util.Scanner;

public class AgeTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.nextLine();
        int age = 0;
        try {

            System.out.println("Enter your age ");
            age = in.nextInt();
        }catch (Exception e ){
            System.out.println("Invalid age entered ");
            System.out.println(e.toString());
        }

        System.out.println("NAme " + name);
        System.out.println("Age " + age);
    }
}
