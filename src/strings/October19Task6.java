package strings;

import java.util.Scanner;

public class October19Task6 {
    public static void main(String[] args) {
         //Scanner input = new Scanner(System.in);
        String str1 = "Toyta, BMW, Juguare";

        if (str1.isEmpty()){
            System.out.println("No cars in your garage ");
        }
        else if (str1.contains("Toyta")||str1.contains("Nissan")) {
            System.out.println("There is a Japanese car in your garage");

        }
        else if (str1.contains("BMW")){
            System.out.println("There is German car in your garage");
        }
        else if (str1.contains("Maserati")){
            System.out.println("There is an Italian car in your garage");
        }
        else if (str1.contains("Jaguar")){
            System.out.println("There is British car in your garage");
        }
        else {
            System.out.println("No x cars");
        }
    }
}
