package strings;

import java.util.Scanner;

public class EqualEx {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner((System.in));
        String word = "Cybertek";
        String word2 = "";

        System.out.println(word.equals(word2));
        int len = word.length();
        System.out.println(len == word2.length());

        System.out.println(word.isEmpty()); // word.length() == 0
        System.out.println(word2.isEmpty());

    }

}
