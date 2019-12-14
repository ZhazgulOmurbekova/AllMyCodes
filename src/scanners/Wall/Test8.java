package scanners.Wall;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println( "How many weeks in 999 days");
        int a = scanner.nextInt();
        int b = a /7; // 142
        int c = a %7; // 5
        int d = c * 24;
        int f = d / 60;
        int l = d % 60;
        int k = l * 60;
        System.out.println(b + " weeks");
        System.out.println(d + " hours");
        System.out.println(f + "min");
        System.out.println(k + " seconds");

    }
}
