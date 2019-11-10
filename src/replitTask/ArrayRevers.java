package replitTask;

import java.util.Scanner;

public class ArrayRevers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below
        String []arr=sentence.split(" ");
        String last="";

        for (int i = arr.length - 1; i >= 0; i--) {
            last += arr[i] + " ";
        }
        System.out.println("Reversed String:");
        System.out.println(last.substring(0, last.length() - 1));

    }
}

