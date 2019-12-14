package scanners.Wall;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days are left unit the New Year ");
        int days= scanner.nextInt();
        int month = days / 30;
        int result = days % 30 ;
        System.out.println(month + " month and "+ result  + " days left unit the New Year");
    }
}
