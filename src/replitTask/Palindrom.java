package replitTask;

public class Palindrom {
    public static void main(String[] args) {
        String check = "tattarratta";
        System.out.println(isPalindrome(check));

    }

    public static boolean isPalindrome(String check) {
        String palind = "";
        for(int i=check.length()-1; i >=0; i--){
            palind = palind + check.charAt(i);
        }


        if(check.equals(palind)){
            return true;
        } else{
            return false;
        }

    }
}
