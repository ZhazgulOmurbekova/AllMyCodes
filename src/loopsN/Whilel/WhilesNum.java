package loopsN.Whilel;

import java.util.Scanner;

public class WhilesNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter");
        int num = in.nextInt();
   int start=0;
   while (start<=num ){
       System.out.println(start++);
   }
}}
