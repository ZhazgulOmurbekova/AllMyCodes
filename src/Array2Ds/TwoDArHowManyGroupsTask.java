package Array2Ds;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArHowManyGroupsTask {
    public static void main(String[] args) {
        /*Create a program that will ask the user to enter how many groups they have.
        Then ask the user to enter how many students are in each group. Allow the user to enter each name
        of the people in each group. Print the 2D array of all the groups at the end
         */
        Scanner input = new Scanner(System.in);
        System.out.println("How many groups do you have");
        int numOfGroups = input.nextInt();
        input.nextLine();
        String [][] allGroups = new String[numOfGroups][];
        for(int i=0; i < allGroups.length; i++) {
            System.out.println("How many people are in group " + (i+1));
            int numInGroup = input.nextInt();
            input.nextLine();
            String [] group = new String[numInGroup];
            for(int j=0; j < group.length; j++) {
                System.out.println("Enter name " + (j+1));
                group[j] = input.nextLine();
            }
            allGroups[i] = group;
        }
        System.out.println(Arrays.deepToString(allGroups));
    }
}
