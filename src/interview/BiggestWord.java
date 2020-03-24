package interview;

import java.util.Arrays;

public class BiggestWord {
    /*Given the String:
"Write a program that creates a group of given size thisisabigword”
Find the biggest word in your String and print it.*/
    public static void main(String[] args) {



    String str = "Write a program that creates a group of given size thisisabigword";


    String []arr=str.split(" ");
    int length = 0;
    System.out.println(Arrays.toString(arr));
    for (String word: arr){
        if(word.length() > length){
            length = word.length();

        }
    }
        for (String word:arr) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
