package replitTask;

import java.util.Arrays;
import java.util.Scanner;

public class Binery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] arr = new int[8];

        //TODO: Write your code below.
        //78 = 64 + 8 + 64; 01001100

    for (int i=0, j=128; i<arr.length;i++, j/=2){

        if (decimal-j>=0){
            arr[i]=1;
            decimal=decimal-j;
        }
        else {
            arr[i]=0;
        }
    } System.out.println(Arrays.toString(arr));


        }

    }

