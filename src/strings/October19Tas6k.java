package strings;

import java.util.Scanner;

public class October19Tas6k {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name =input.nextLine();


        if (name.charAt(0)=='a'|| name.charAt(0)=='z')
        {
            System.out.println("It is cool name ");
        }else {
        System.out.println("Sorry not a cool name ");
    }
    }
}
