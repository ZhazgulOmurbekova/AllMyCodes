package methods;

import java.util.Arrays;
import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
//        CountWord w = new CountWord();
//        w.countWords();
//        logins();
        isPalindrome("civic");
        System.out.println(isPalindrome("civic"));

    }
    public void countWords(){
        Scanner s = new Scanner(System.in);
        //1- Print out the intro sentence
        System.out.println("Enter a sentence");
        //2- Accept a String from the user
        String sentence = s.nextLine();
        //3- Create a logic to process the String: split the String and store
        //in another variable
        String [] arr=  sentence.split(" ");
        //4- Print out the elements of the String array
        System.out.println(Arrays.toString(arr));
        //5- Print out the length of the String array
        System.out.println(arr.length);

    }
    public static void login(){

        //1- Print out the intro text
        //2- Request username from the user
        //3- Request password from the user
        //4- Check if the expected username and actual username are matching
        //5- Print out final message
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Id");
        String expectedId = s.nextLine();

        if (expectedId.equals("johnJava" )){
            System.out.println("Enter your password");
            String expectedPassword = s.nextLine();
            if (expectedPassword.equals("123456")) {
                System.out.println("Successful");
            } else {
                System.out.println("not correct");
            }
        }


    }
    public static void logins(){
        //0- Create test data
        String expectedUsername = "johnJava";
        String expectedPassword = "123456";
        //1- Print out the intro text
        System.out.println("You have clicked to the login button!");
        System.out.println("Please enter username: ");
        //2- Request username from the user
        Scanner scan = new Scanner(System.in);
        String actualUsername = scan.nextLine();
        //3- Request password from the user
        System.out.println("Please enter password: ");
        String actualPassword = scan.nextLine();
        //4- Check if the expected username and actual username are matching
        //5- Print out final message
        if(expectedUsername.equalsIgnoreCase(actualUsername) && expectedPassword.equals(actualPassword)){
            System.out.println("You have logged in!");
        }else{
            System.out.println("Either your username or password is not matching!");
        }
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
}
