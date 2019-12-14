package scanners.Wall;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Pleas enter enter the min");
        int minut = scanner.nextInt();
        int hour = minut/60;
        int t = minut % 60;




        System.out.println(minut + "mins is " + hour + " hours and " + t + "minutes");


    }
}
