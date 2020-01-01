package replitTask;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveList {
    /*Create a static method that:
is called removeAll
returns nothing
takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord

This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.

Example:

ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

removeAll(wordList,"hi");

now wordList is ["hey","yo"]
*/

    public static void removeAll(ArrayList<String> wordList, String targetWord ){
        for (int i = 0; i < wordList.size(); i++) {
            if(wordList.get(i).equals(targetWord))
         wordList.remove( targetWord);
         i--;



        }
        System.out.println(wordList);
    }

    public void removeEveryOther(ArrayList<String> words){
        for (int i = 0; i < words.size(); i++) {

            words.remove(i);

        }
    }

    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel)
    {
        int result;
        for (int i = 0; i < deliveries.size(); i++) {

     result=deliveries.set(deliveries.get(i), (deliveries.get(i)/max_fuel ) + (deliveries.get(i)/max_fuel));

        }
return max_fuel;
    }

    public static void main(String[] args)
    {

        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        int times = refuel_times(arr,3);
        System.out.print(times);//should output 5


    }//end main

}
