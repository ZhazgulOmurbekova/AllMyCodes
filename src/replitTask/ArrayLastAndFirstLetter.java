package replitTask;

import java.util.Scanner;

public class ArrayLastAndFirstLetter {
    public static void main(String[] args) {

        /*Given a String array words, iterate through each word and
         print first and last letter of each element in the format below
Example:
words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]  */
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        //TODO: Write your code below
        //String []arr= words.(",");
        String first = "";
        String last = "";

        System.out.print("[");
        for (int i = 0; i < words.length; i++)
        {
            first = words[i].substring(0,1);
            last = words[i].substring(words[i].length()-1);

            if (i == words.length-1)
            {System.out.print(first + last);
            continue;
            }
            System.out.print(first + last + ", ");
        }
        System.out.print("]");






}
}
