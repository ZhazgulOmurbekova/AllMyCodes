package scanners.Wall;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many apples?");
        int apple = scanner.nextInt();
        System.out.println("How many females in this class ?");
        int females = scanner.nextInt();
        System.out.println("How many males ?");
        int males = scanner.nextInt();
        System.out.println("How many for Cybertek?");

        System.out.println(apple-(85*females+ males*45));



    }
}
