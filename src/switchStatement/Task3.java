package switchStatement;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        //System.out.println("Enter");
        Random random = new Random();
        int num = random.nextInt(26);
        System.out.println("Random num:" + num);
        num += 65;
        char letter = (char)(num);
        System.out.println("My number is " + num);
        System.out.println("Your letter is "+ letter);
    }
}
