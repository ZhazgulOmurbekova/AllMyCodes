package Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class AcceptenceCriteria {
    public static void main(String[] args) {
        //1- Print out the welcome&intro message
        //2- Accept an int input from user and assign it as the size of the Array
        //3- Print out "enter number for your array" message
        //4- Accept int input values from user and assign them as the elements of the array
        //5- Print out "string value" of the array
        //6- Create a logic to print out first and second half of the arrays in different lines
        Scanner input = new Scanner(System.in);
        System.out.println("welcome");
        System.out.println("Enter the size of the array");
        int  size = input.nextInt();
        input.nextLine();
        int [] arr = new int [size];

        System.out.println("Enter the element of array");
        for (int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Arrays"+ Arrays.toString(arr));

        int [] part1 = Arrays.copyOfRange(arr, 0, arr.length);
        int [] part2 = Arrays.copyOfRange(arr, arr.length/2, arr.length);
        System.out.println("part 1"+ Arrays.toString(part1));
        System.out.println("part 2"+ Arrays.toString(part2));

    }
}
