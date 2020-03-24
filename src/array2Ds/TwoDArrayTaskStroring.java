package array2Ds;

import java.util.Arrays;

public class TwoDArrayTaskStroring {
    public static void main(String[] args) {
        /*Create a 2D String array that will hold 3 groups.
        Create three 1D arrays and initialize them with some group members names.
        Store each 1D array into your 2D and print the 2D array at the end
         */
        String [][] groups= new String [3][];
        String [] oneName={"name1", "name2", "name3", "name4"};
        String [] twoName={"james", "adam"};
        String [] threeName={"bob", "mat", "john"};

        groups [0]=oneName;
        groups [1]=twoName;
        groups [2]=threeName;


        System.out.println(Arrays.deepToString(groups));
    }
}
