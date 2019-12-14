package strings;

import java.util.Scanner;

public class October19Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String acNum = in.nextLine();

        if (acNum.charAt(0)=='2' && acNum.length() >= 7) {
            System.out.println("valid");
        }
        else if (acNum.charAt(0)=='5'&& acNum.length()>=10){
            System.out.println("Valid");
        }

        else {
            System.out.println("invalid acNum");

        }
    }
}