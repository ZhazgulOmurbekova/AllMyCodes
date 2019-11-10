package replitTask;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCubes {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int i=1;
        int power;
        int arm;
        int number;


        while(i<500)
        {
            number=i;
            arm=0;
            while(number>0)
            {
                power=number%10;
                arm=arm+(power*power*power);
                number=number/10;
            }
            if(arm==i)
                System.out.println(i);
            i++;
        }

    }
    }


