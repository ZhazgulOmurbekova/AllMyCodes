package scanners.Wall;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Taskn3 {
    public static void main(String[] args) {

//       3 Write a program that will ask user to enter two numbers.
//        Declare a boolean with the following value: numberOne >
//        numberTwo. Print the resulting boolean.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
         boolean n3  = n>a;
        System.out.println(n3);

//       4 Write a program that will ask user to enter a boolean: true or false.
//        Print the opposite of the boolean they gave.> input: true> output: false

        boolean check = input.nextBoolean();
        System.out.println(!check);





    }
}
