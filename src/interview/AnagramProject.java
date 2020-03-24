package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class AnagramProject {


    public static void main(String[] args) {
        ArrayList<String> arrs = new ArrayList<>();
        arrs.add("charm");
        arrs.add("march");
        arrs.add("may");
        arrs.add("pen");
        arrs.add("nep");

        System.out.println(anagram(arrs));
    }

    static private final Logger log = Logger.getLogger(Anagram.class.getName());

    public static int anagram(ArrayList<String> arrs){

        int counter = 0;
        for (int i = 0; i < arrs.size(); i++) {
            String [] arrayOne = arrs.get(i).split("");
            Arrays.sort(arrayOne);
            for (int j = i+1; j < arrs.size(); j++) {
                String [] arrayTwo = arrs.get(j).split("");
                Arrays.sort(arrayTwo);
                if (Arrays.equals(arrayOne, arrayTwo)){
                    counter++;
                    arrs.remove(j);
                    arrs.remove(i);
                    i--;
                    break;
                }
            }
        }
       return counter;
    }
}
