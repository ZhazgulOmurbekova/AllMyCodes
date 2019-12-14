package strings;

import java.util.Scanner;

public class October19Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1   = input.nextLine();
       String name2 = input.nextLine();
       String email="";


       if (name1.length()>=6&&name2.length()>=6){
          email = name1.substring(0,4);
          email+= name2.substring(name2.length()-3);
         // email+= "cybertek";
           System.out.println(email);

       }
       else {
           System.out.println("Invalid le");
       }
    }
}
