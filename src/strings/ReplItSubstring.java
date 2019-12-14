package strings;

import java.util.Scanner;

public class ReplItSubstring {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        String enterByUser= input.nextLine();
        int indexOfSpase = enterByUser.indexOf(" ");

        String word1 = enterByUser.substring(0,indexOfSpase);

        String word2 = enterByUser.substring(indexOfSpase+1);

        System.out.println("entered by User"+enterByUser);
        System.out.println("word1" +word1);
        System.out.println("word2"+ word2);

        String firstLatter1 = word1.substring(0,1).toUpperCase();
        String firstLatter2 = word2.substring(0,1).toUpperCase();

        String firstWordLeft = word1.substring(1);
        String socondWordLeft = word2.substring(1);

        System.out.println(firstLatter1+ firstWordLeft+" "+ firstLatter2+socondWordLeft);
    }
}
