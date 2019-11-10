package scanners.Wall;

import java.util.Scanner;
// u menya 75 ih nado razmenyat

public class Test5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Change of ");
        int som = scanner.nextInt();
        int fifty = som / 50; //1
        int ostok50 = som % 50; //25 som
        int twenty = ostok50 / 20; //1
        int ostatok20 = ostok50 % 20; //5
        int fife = ostatok20 / 5; // 1
        int ostatok5 = ostatok20 % 5;
        int one = ostatok5 / 1;
        System.out.println("vsego: 50 som - " + fifty + ", 20 som- " + twenty +
                " and 5 som- " + fife + " and  1 som-" + ostatok5);
    }
}
