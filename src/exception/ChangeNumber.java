package exception;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangeNumber {
    public static void main(String[] args) {

        /*Create an array with values {1,2,3,4,5}
Ask user to enter the index they want to change, and then the number they want to change that element to.
Case: User could enter an index that doesnt exist
Case: User could enter a character instead of the index they want to change or a
 character instead of the number they want to change it to
         */
        int[] arr = {1, 2, 3, 4, 5};
        Scanner in = new Scanner(System.in);
        try {

            System.out.println("Enter the index you want to change");
            int index = in.nextInt();
            // in.nextLine();
            System.out.println("Enter the num you want to add");
            int number = in.nextInt();
            in.nextLine();

            arr[index] = number;
        } catch (InputMismatchException e) {
            System.err.println("Invalid number ");
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("entered invalid index");
        }finally {
            System.out.println(Arrays.toString(arr));
        }


    }
}
