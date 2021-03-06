package methods;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram2("marchhh", "charmhh"));

    }

    public static boolean isAnagram(String str1, String str2) {
        //1- Check if both strings have same length
        if (str1.length() != str2.length()) {
            return false;
        }
        //2- Create two char array, and store the strings as char arrays
        char[] str1arr = str1.toCharArray(); // march --> m,a,r,c,h
        char[] str2arr = str2.toCharArray(); // charm --> c,h,a,r,m
        //3- sort these arrays
        Arrays.sort(str1arr);
        Arrays.sort(str2arr);
        //4- check if the two char arrays equals, and return value
        return Arrays.equals(str1arr, str2arr);
    }


    static boolean isAnagram2(String a, String b) {

        int count = 0;
        int len = a.length();
        if (a.length() != b.length()) return false;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if ((a.charAt(i) + "").equalsIgnoreCase(b.charAt(j) + "")) {
                    b = b.replaceFirst(b.charAt(j) + "", " ");
                    count++;
                    break;
                }
            }
        }
        if (count == len) {
            return true;}

        return false;
    }
}