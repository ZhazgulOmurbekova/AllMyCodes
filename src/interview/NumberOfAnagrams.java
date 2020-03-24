package interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfAnagrams {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        ArrayList<String> two = new ArrayList<>();
        one.add("mon"); one.add("omn");
        two.add("dad"); two.add("ddaa");
        ArrayList<ArrayList<String>> lists = new ArrayList<>();
        lists.add(one);
        lists.add(two);

        System.out.println(totalNumOfAnagram(lists));



    }

    public static int totalNumOfAnagram(ArrayList<ArrayList<String>> words) {
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            char[] first = words.get(i).get(0).toCharArray();
            char[] second = words.get(i).get(1).toCharArray();


            Arrays.sort(first);
            Arrays.sort(second);

            if (Arrays.equals(first, second)) count++;
        }
        return count;
    }
}
