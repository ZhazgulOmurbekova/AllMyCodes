package DoWhilesLoop;

import java.util.Scanner;

public class DoWhileTaskLatter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char latter = in.nextLine().toUpperCase().charAt(0);

        if (latter>=65 && latter<=90){
            while (latter!=91){
                System.out.println(latter++);
            }

        }else {
            System.out.println("Not a valid letter");
        }
    }
}
