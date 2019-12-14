package methods;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindr("civic"));
        System.out.println(isPalindrome("civic"));

    }
    public static boolean isPalindrome(String word){

        String palindrome = "";
        for (int i =  word.length()-1; i >= 0; i--) {
            palindrome += word.charAt(i);
        }
        if (palindrome.equalsIgnoreCase(word)){
            return true;
        }else{
            return false;
        }
    }


    public static boolean isPalindr(String str){
        int start = 0;
        int end = str.length()-1;
        while (start < end){
            if(str.charAt(start) == str.charAt(end)){
                return true;
            }
            start++;
            end--;
        }return false;
    }
}
