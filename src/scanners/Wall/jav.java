package scanners.Wall;

import java.util.Scanner;

public class jav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );
        System.out.println("What is the wall color?");
        String color = input.nextLine();
        System.out.println("What is the length?");
        int length = input.nextInt();
        input.nextLine();
        System.out.println("Is it good one ?");
        String answer = input.nextLine();
        System.out.println("Color: "+ color);
        System.out.println("length: "+ length);
        System.out.println("Good?:" + answer);
    }
}
