package interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BiggestPalindrome {

//    public static void main(String[] args) {
//
//
//        List<String> list = new ArrayList<>();
//        list.add("civic");
//        list.add("maam");
//        list.add("aadddaa");
//        list.add("asdfgfds");
//
//        System.out.println(biggestPalindrome(list));
//
//    }


    /*
   2) Create a method that will accept an ArrayList of Strings. Return the biggest Palindrome.
   Ex:
   Input: {"aba", "racecar"}
    */
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("aga"); words.add("racecar"); words.add("cars");
        words.add("water"); words.add("esdfgfdse");words.add("tenet");
        System.out.println(biggestPalindrome3(words));
    }



    public static String biggestPalindrome1 (ArrayList<String> words) {
        String palindrome = "";
        for(String word: words) {
            if(isPalindrome(word) && word.length() > palindrome.length()){
                palindrome = word;
            }
        }
        return palindrome;
    }
    static boolean isPalindrome(String word) {
        return new StringBuilder(word).reverse().toString().equals(word);
    }








    //Create a method that will accept an ArrayList of Strings. Return the biggest Palindrome.
    public static String biggestPalindrome2(List<String> list) {
        boolean check = false;
        List<String> newList = new ArrayList<>();
        String biggest ="";

        int length = 0;

        for (String word : list) {
            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                    check = false;
                    break;

                } else {
                    check = true;
                    newList.add(word);
                }
            }
        }
        for(String word : newList)
            if(word.length() > length){
                length = word.length();
            }

        for (String word: newList) {
            if (word.length() == length) {
                biggest = word;
            }
        }
        return biggest;
    }


    public static String biggestPalindrome3 (ArrayList<String> words) {
        String palindrome ="";


    outer:   for(String word: words){
           for (int i = 0; i < word.length()/2; i++) {
               if(word.charAt(i) != word.charAt(word.length()-1-i)){
                 continue outer;

               }
           }
         if(word.length() > palindrome.length())  {
             palindrome = word;
         }
       }
        return palindrome;
    }


}
