package interview;

public class NumberPalindrome {
    /*Create a method that will accept a number (long). Return a boolean: true if your given number is a palindrome
     number or false if it is not** You know how to do it with String manipulation.
     If you want a challenge do it without using any String in your codeEx: > input: 1001> output: true> input: 1234> output: false
     */

//    public static boolean isPalindromeNumber(long num) {
//        for(long i = 10; i <= num; i*=10) {
//            if(num/i == num % i) return true;
//        }
//        return false;
//    }
public static void main(String[] args) {
    System.out.println( palindromeNum(1234554321));
}

    public static boolean palindromeNum(long num){
        long workingNum = num;
        long revers = 0;

      while (workingNum != 0) {

          long last = workingNum % 10;
          revers = revers * 10 + last;
          workingNum /= 10;





        }return num == revers;
    }
}
