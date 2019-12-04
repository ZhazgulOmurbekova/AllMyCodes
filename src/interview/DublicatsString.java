package interview;

import java.util.Arrays;

public class DublicatsString {
    public static void main(String[] args) {
        String [] words = {"sdfg", "ghjkjuio", "hjklkjhhjk","sdf","sdfg"};

        String word = "";
        String temp = "";
        for (int i = 0; i < words.length; i++) {
            if(!temp.contains(words[i])) {
                temp += words[i];

                int count = 0;
                for (int j = 0; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                    }
                    if (count >= 2) {
                        word += words[i] + " ";
                    }
                }
            }
        }
        String [] arr = word.split(" ");
        System.out.println(Arrays.toString(arr));

    }
}
