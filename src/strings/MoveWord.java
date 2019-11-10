package strings;

import java.util.Scanner;

public class MoveWord {
    public static void main(String[] args) {

        /*System.out.println("Enter");
        String name = input.nextLine();

        String firstLater= name.substring(0,1);
        firstLater= firstLater.toUpperCase();*/
        Scanner input = new Scanner(System.in);


        String name =input.nextLine();
        int spaceOfspace = name.indexOf(" ");

        String senten = name.substring(0,spaceOfspace);
         String sent2 = name.substring(spaceOfspace + 1);
        System.out.println(sent2 + " " +senten);

    }
}
