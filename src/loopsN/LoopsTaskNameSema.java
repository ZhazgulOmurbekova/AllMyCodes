package loopsN;

import java.util.Scanner;

public class LoopsTaskNameSema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


            System.out.println("Enter the word :");
           String word = input.nextLine();

            String rev = "";


            for (int i = word.length()-1; i >=0; i--){
                rev += word.charAt(i);

            }
        System.out.println(rev);


        }
    }

