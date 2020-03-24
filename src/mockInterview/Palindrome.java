package mockInterview;

import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args) {
        String []word  = {"civic", "mom", "aaaabaaaa"};
        System.out.println(isPalindrome(word));

    }
    public static String isPalindrome(String []words){
      String longestPol = "";
            for(String word : words) {
                boolean check = true;
                for (int i = 0; i < word.length() / 2; i++) {

                    if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                        check = false;
                    }
                    if (check) {
                        if (word.length() > longestPol.length()) {
                            longestPol = word;
                        }
                    }


                }
            }
            return longestPol;
    }
}
