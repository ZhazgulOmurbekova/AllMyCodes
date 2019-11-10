package switchStatement;

import java.util.Random;
import java.util.Scanner;

public class RanTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        int num = scanner.nextInt();
       // String word ="";
        switch (num){
            case 1 :
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 5:
                System.out.println("five");
                break;

            default:
                System.out.println("Invalid number ");
        }
    }
}
