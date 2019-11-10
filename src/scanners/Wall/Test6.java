package scanners.Wall;

import java.util.Scanner;

public class Test6 {
    // i have 1650 ml watter how find  litr and ml
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much watter I have?");
         int ml = scanner.nextInt();
         int litr= ml / 1000;
         int mmm = ml % 1000;
        System.out.println( "I have "+ litr + " litr  and " + mmm + " ml in my cup" );




    }
}
