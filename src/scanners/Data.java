package scanners;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
//String name = "James";
//String lastName = "Bond";
//int age =45;
//String location = "London,UK";
//boolean isHeOk =true;
//        System.out.println();

        Scanner input = new Scanner (System.in);

        System.out.println("What is your name ?");
        String name = input.nextLine();
        System.out.println("Welcome, "+ name + "!");
        System.out.println("Where are you from"+ name + "? ");
        String place = input.nextLine ();
        System.out.println( place + " is a cool place to visit");
        System.out.println(name + " , how old are you?");
        int age = input.nextInt();
        System.out.println(age + " age is fun !");


    }
}









