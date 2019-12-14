package scanners.Wall;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt ();
        int rage = 65;
        int result = rage-age;
        System.out.println("Becaus your are "+ age + "you will retire  "+ result );

    }
}
