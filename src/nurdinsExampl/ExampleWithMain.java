package nurdinsExampl;

import java.util.Scanner;

public class ExampleWithMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        helloName(name);
    }

    public static void helloName(String name) {


        String hello ="hello";
        System.out.println(hello+name+"");

    }
}


