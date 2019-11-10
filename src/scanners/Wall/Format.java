package scanners.Wall;

import sun.tools.java.ScannerInputReader;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in );
        System.out.println(" month?");
        int month = scanner.nextInt ();
        System.out.println( "Day");
        int day = scanner.nextInt();
        System.out.println("year");
        int year = scanner.nextInt();


        String result = " "+ month + "/"+ day + "/"+ year;
        System.out.println(result);

        year += 5;
        day -=1;

        String result2 = " "+ month + "/"+ day + "/" + year;
        System.out.println(result2);


        int age = 45;
        int age2 = 65;







    }
}
