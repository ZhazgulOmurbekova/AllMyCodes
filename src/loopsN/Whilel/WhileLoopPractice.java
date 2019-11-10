package loopsN.Whilel;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter address");

        String address = in.nextLine();
        int count=0;
        while (address.contains("IL")){
            count++;

            System.out.println("enter address");
            address=in.nextLine();
        }
        System.out.println(count);
    }
}
