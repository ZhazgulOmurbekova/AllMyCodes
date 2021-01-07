package interview;

import java.util.Arrays;

public class DublicatsString {
    public static void main(String[] args) {
        String [] teams = {"Cubs", "Brewers", "Cubs","Cubs","Cardinals", "Brewers"};

        String word = "";
        String result = "";
        for (int i = 0; i < teams.length; i++) {
            if(!result.contains(teams[i])) {
                result += teams[i];

                int count = 0;
                for (int j = 0; j < teams.length; j++) {
                    if (teams[i].equals(teams[j])) {
                        count++;
                    }
                    if (count >= 2) {
                        word += teams[i] + " ";
                    }
                }
            }
        }
        String [] arr = word.split(" ");
        System.out.println(Arrays.toString(arr));




    }




}
