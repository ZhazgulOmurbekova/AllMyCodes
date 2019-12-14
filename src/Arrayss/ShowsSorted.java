package Arrayss;

import java.util.Arrays;

public class ShowsSorted {
    public static void main(String[] args) {
        String[] shows = {"Game of Thrones", "Friends", "Prison Break", "Doctor who", "Greys Anatomy"};

        Arrays.sort(shows);
        // System.out.println(shows.toString());
        for (int i = 0; i < shows.length; i++) {
            System.out.println("#" + i + " " + shows[i]);
        }


        int[] arr = {15, 25, 33, 35, 66, 44, 78, 95, 98, 1, 500};
        int min = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i]> max){
                max= arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];

            }
        }
        System.out.println("min " +min);
        System.out.println("max "+max);

        }
    }

