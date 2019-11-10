package nurlansTask;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();

        // Your code here
        //------------------------------------------------
        char firstLatter = n1.charAt(n1.length()/2-1);
        char secondLatter = n1.charAt(n1.length()/2);
        char lastLatter = n1.charAt(n1.length()/2+1);

       if (n1.length()%2==1&&n1.length()>=5){
           System.out.println(""+firstLatter+secondLatter+lastLatter);

       }
       else {
           System.out.println();
           String str =scanner.nextLine().toLowerCase();
       }

    }
    }
