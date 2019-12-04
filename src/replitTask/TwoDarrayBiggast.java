package replitTask;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarrayBiggast {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = {{3,3,4,5,4},{4,2,1,5,6},{2,2,4,4,7,7}};


        //your code here

        int matches = 0;

        for (int i =0; i<=arr.length-1; i++)
        {
            for(int j=0; j<=arr[i].length-2; j++ )
            {
                if (arr[i][j]== arr[i][j+1]){
                    matches++;
                }

                }

            }
        System.out.println("matches: "+ matches);
        }

    }



