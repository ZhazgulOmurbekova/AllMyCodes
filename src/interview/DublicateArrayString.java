package interview;

import java.util.Arrays;

public class DublicateArrayString {

    public static void main(String[] args) {
        String [] teams = {"Cubs", "Brewers", "Cubs","Cubs","Cardinals", "Brewers"};

        String result = "";
        for (int i = 0; i < teams.length; i ++){ // it will take first element of teams arr
            int counter= 0;
            for(int j = 1; j < teams.length; j++){ //it will check take next elements
                if (teams[i].equalsIgnoreCase(teams[j])){ // compare elements
                    counter++; // if they are same it will count

                    if (!result.contains(teams[i] + "") &&  counter >1){
                        result+=teams[i] + " ";
                    }
                }
            }
        }
        String [] a = result.split(" ");
        System.out.println(Arrays.toString(a));
    }
}
