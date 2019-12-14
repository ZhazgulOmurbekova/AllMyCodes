package switchStatement;

import java.util.Scanner;

public class SwitTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Input number");
        int day = scanner.nextInt();
        String dayString = "";
        boolean valid = true;

        switch (day){
            case 1:
                //System.out.println ("Sunday");
                dayString = "Sunday";
                break;
            case 2:
               // System.out.println ("Monday");
                dayString = "Monday";
            break;
            case 3:
                //System.out.println  ("Tuesday");
                dayString = "Tuesday";
                break;
            case 4:
               // System.out.println("Wednesday");
                dayString = "Wednesday";
                break;
            case 5:
                //System.out.println("Thuersday");
                dayString = "Thuersday";
                break;
            case 6:
                //System.out.println ("Friday");
                dayString ="Friday" ;
                break;
            case 7:
                //System.out.println("Saturday");
                dayString = "Saturday";
                break;

            default:
                System.out.println("Invalid day range");
            valid = false;
        }
        if (valid){
            System.out.println(day + " is "+ dayString);
        }
    }
}
