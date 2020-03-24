package collectionFramework;

import java.util.*;

public class RemoveNum {
    /*[=] Task
    Create a Set of numbers and ask the user to enter to enter 5 numbers.
    - Go through each number and remove any numbers that are odd
    - Print your Changed Set*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.println("how many nums");
        int a = in.nextInt();
        in.nextLine();
        for (int i = 0; i < a; i++) {
            numbers.add(in.nextInt());
        }
        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            int num = it.next();


                if (num % 2 == 1) {
                    it.remove();
                }
            }


            System.out.println(numbers);

        }


}
