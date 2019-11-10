package strings;

import java.util.Scanner;

public class ExampleForCont {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
//        System.out.println("Enter a message");
//        String message =

        String name = input.nextLine();

        if (name.isEmpty()){
            System.out.println("Invalid name ");
        } else if (name.contains("a")){
            System.out.println("cool name");
        }else {
            System.out.println("Okay name ");
        }
    }
}
