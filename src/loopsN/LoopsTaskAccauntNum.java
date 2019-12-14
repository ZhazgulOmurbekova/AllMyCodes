package loopsN;

import java.util.Scanner;

public class LoopsTaskAccauntNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i =0; i <=50; i++){

            if (i%10==3){
                continue;
            }
            System.out.println(i);

        }


    }
}
