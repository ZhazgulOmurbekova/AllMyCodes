package methods;

import java.util.Scanner;

public class MethodsCoutWord {
    public static void main(String[] args) {
        /*Create a void method name countWords that will accept a String as an argument. Print the following:
“The number of words in the sentence is: numberOfWords”*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ");
        String name ="ksdjf kdjfh skdhf skhf"; //input.nextLine();
        numberOfThisWords(name);

    }
    public static void numberOfThisWords(String zuzgul ){
        String []words =zuzgul.split(" ");
        System.out.println(words.length);
    }
}
