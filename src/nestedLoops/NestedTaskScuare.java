package nestedLoops;

import java.util.Scanner;

public class NestedTaskScuare {
    public static void main(String[] args) {

//
//        for (int i =0; i <5 ; i++){
//            System.out.println("outer is "+i);
//            for (int j = 0; j <=i; j++){
//                System.out.println("inner is " + j);
//            }
//            System.out.println();
//        }Write a program that asks the user to enter a number. The number will be how big your square will be. Square made of ‘#’ sign
//> input: 5
//> output:
//# # # # #
//# # # # #
//# # # # #
//# # # # #
//# # # # #
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();

        for (int i = 0 ; i <num;i ++ ){
            for (int j = 0 ; j<num; j++){
                System.out.print(" # ");
            }
            System.out.println();
        }
    }
}
