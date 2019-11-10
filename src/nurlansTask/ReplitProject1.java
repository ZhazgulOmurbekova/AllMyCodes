package nurlansTask;

import java.util.Scanner;

public class ReplitProject1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TASK 1
        System.out.println("Enter the number:");
        int x =input.nextInt();
        int first=0;
        int second=1;
        int result=0;
        System.out.print(first+" ");

        //your code here
        //----------------------------------------------------------
        for (int i=1;i<x; i++){
            result = first + second;
           first= second;
            second = result;

            System.out.print(first+" ");


        }
    }
}
