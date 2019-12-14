package loopsN.Whilel;

import java.util.Scanner;

public class LoopsTaskBankAcaunt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter amount");


       int transBal;

        int balance = 1500;//
        int dec=0;

        while (balance>0){


            System.out.println("Please enter amount");
            transBal= in.nextInt();

            if (transBal<=balance){
                System.out.println("item Purchased");
                balance-=transBal;
                dec=0;
            }
            else {
                System.out.println("Decline");
                dec++;
            }
            if (dec==3){
                System.out.println("Card is locked");
                break;
            }

        }
        if (balance==0){
            System.out.println("you broke");
        }


    }
}
