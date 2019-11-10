package strings;

import java.util.Scanner;

public class IndOf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter");
        String name = input.nextLine();

        String firstLater= name.substring(0,1);
        firstLater= firstLater.toUpperCase();

        String restOfTheWord = name.substring(1).toLowerCase();
        System.out.println(firstLater+restOfTheWord);
    }
}
