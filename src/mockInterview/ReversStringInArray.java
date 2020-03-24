package mockInterview;

import java.util.Arrays;

public class ReversStringInArray {
    public static void main(String[] args) {
        String [] arrs = {"java", "is", "fun"};
        String[] newArray = new String[arrs.length];
        for (String arr : arrs) {

            String a = "";
            for (int i = arr.length() - 1; i >= 0; i--) {
                a += arr.charAt(i) + "";}
               newArray = a.split(" ");
           // if ()
            System.out.print(Arrays.toString(newArray));
            }

        }
    }

