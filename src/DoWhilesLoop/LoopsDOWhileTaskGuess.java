package DoWhilesLoop;

import java.util.Random;
import java.util.Scanner;

public class LoopsDOWhileTaskGuess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random ran = new Random();

        int rannum= ran.nextInt(100)+1;

        int guess=0;
        int count =0;

        do {
            System.out.println("enter Guess ");
            guess= in.nextInt();
            count++;

            if (guess<rannum){
                System.out.println("too low");
            }else if (guess>rannum){
                System.out.println("too high");
            }
            else {
                System.out.println("you guessed right after "+ count+ " tries ! ");
            }
        }
        while (guess!=rannum) ;
    }
}
