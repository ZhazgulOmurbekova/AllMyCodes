package mockInterview;

import java.util.Arrays;

public class ReversStringWithSwaping {
    public static void main(String[] args) {
        String [] arrs = {"java", "is", "fun"};
        for (int i = 0; i < arrs.length/2; i++) {
            String temp = arrs[i];
            arrs[i] = arrs[arrs.length-1-i];
            arrs[arrs.length-1-i] = temp;


        }
        System.out.println(Arrays.toString(arrs));
    }
}
