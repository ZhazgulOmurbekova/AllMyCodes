package strings;

import java.util.Scanner;

public class October19Task {
    public static void main(String[] args) {
       // Scanner in =new Scanner(System.in);
        String word ="Today is a nice day";

        boolean b = word.startsWith("Today") ;
        System.out.println(b);
        System.out.println("Not:" +!b);

        System.out.println(!word.endsWith("day"));
        System.out.println(word.endsWith("day"));





    }
}
