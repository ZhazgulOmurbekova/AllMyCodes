package interview;

public class LongestSubstringNoRepeating {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {

        char ch ;
        for (int i = 0; i < s.length(); i++) {
          ch = s.charAt(i);
          if(!s.contains(ch+"")){


          }

            s.replace(ch+"","");
            System.out.println(s.length());
          return s.length();



    }       return s.length();
}
 }