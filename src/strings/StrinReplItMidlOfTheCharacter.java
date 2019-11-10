package strings;

import java.util.Scanner;

public class StrinReplItMidlOfTheCharacter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String phrase = new String ("Jazgul");
        String middle3 = new String ("tri"); //I want to print the middle 3 characters in "phrase" which I think is "tri".

        middle3 = phrase.substring (9, 11); // this only prints out 1 letter instead of 3


        System.out.println ("middle3: " + middle3);
    }
}
