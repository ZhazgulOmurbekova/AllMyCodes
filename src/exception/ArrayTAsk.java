package exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayTAsk {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (;;){
            try{
                System.out.println("Enter a number ");
                numbers.add(in.nextInt());
            }catch (InputMismatchException e ){
                break;
            }
            System.out.println(numbers);
        }
    }
}
