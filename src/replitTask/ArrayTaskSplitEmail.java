package replitTask;

import java.util.Scanner;

public class ArrayTaskSplitEmail {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String email =input.nextLine();

        if (email.contains("@")){
            int at =email.indexOf("@");

            System.out.println("Email id: " +email.substring(0,at));
            System.out.println("Email domain: "+ email.substring(at+1));
        }
        else  {
            System.out.println("invalid email");
        }
    }
}
