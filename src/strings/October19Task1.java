package strings;

import java.util.Scanner;

public class October19Task1 {
    public static void main(String[] args) {


        String n = "Cybertek is located in Des Planes";

        Scanner input = new  Scanner(System.in);

        String n2 = input.nextLine();
        int index = n.indexOf(n2);
        System.out.println(index);
    }
}
