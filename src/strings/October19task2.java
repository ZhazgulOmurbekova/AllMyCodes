package strings;

import java.util.Scanner;

public class October19task2 {
    public static void main(String[] args) {
        String str = "We will have a picnic when the weather gets nicer";
        Scanner input =new Scanner(System.in);
        String str2 = input.nextLine();
        //String a = str2.replace('w',str);
        System.out.println(str.replace("w",str2));

    }
}
