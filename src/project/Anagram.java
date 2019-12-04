package project;

import java.util.Arrays;

public class Anagram {
    /*
     * The method takes word1 and word2 and returns boolean. A method check if word1 and
     * word2 are anagram each other then return true, if not then return false
     * @param word1
     * @param word2
     * @return boolean
     * @see ("listen", "Silent") => true, ("java", "cava") => false
     *
     * */

    // Required! Method name is: isAnagram(String word1, String word2)
    public static void main(String[] args) {
        System.out.println(isAnagram("listen","cilent"));
    }

    public static boolean isAnagram(String word1, String word2) {
        char ch1[] = word1.toLowerCase().toCharArray();
        char ch2[] = word2.toLowerCase().toCharArray();


        for (int i = 0; i < ch1.length; i++) {
            for (int j=0; j<i;j++){
                if(ch1.length==ch2.length) {
                    if (ch1[i] == ch2[j]) {
                        //return true;
                    }
                }else if (ch1[i] != ch2[i]) {
                return false;
            }

        }}
        return true;
    }
}