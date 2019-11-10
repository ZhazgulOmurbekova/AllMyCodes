package project;

import java.util.Arrays;
import java.util.Scanner;

public class ZombiTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        int days = 0;
        int alive = 0;



        for (int i = 0; i < inhabitants.length; i++)
        {
            inhabitants[i] = input.nextInt();
        }

        while (inhabitants[0] != 0)
        {
            System.out.println("Day " + days + " " + Arrays.toString(inhabitants));
            for (alive = 0; alive < inhabitants.length; alive++)
            {
                if (inhabitants[alive] == 0)
                {
                    if (inhabitants[0] != 0)
                    {inhabitants[alive -1] = inhabitants[alive -1]/2;}
                    if (inhabitants[inhabitants.length -1] != 0)
                    {inhabitants[alive +1] = inhabitants[alive +1]/2;}
                    if (inhabitants[0] == 0 && inhabitants[inhabitants.length -1] == 0)
                    {
                        inhabitants[0] = 0;
                        inhabitants[inhabitants.length -1] = 0;
                    }
                }
            }
            days++;

        } System.out.println("Day " + days + " " + Arrays.toString(inhabitants));
        System.out.println();
        System.out.println("---- EXTINCT ----");
    }}








