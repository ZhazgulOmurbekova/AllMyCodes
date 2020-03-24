package collectionFramework;

import java.util.*;

public class HashMapEnterNUmber {
    public static void main(String[] args) {
//        [=] Task
//        Given this map:
//        Map<String, Integer> map = new HashMap<>();
//        map.put("First",1);
//        map.put("Second",2);
//        map.put("Third",3);
//        map.put("Forth",4);
//        Ask the user to enter a number from 1 to 4. Then print out the key that goes with the number they entered.
//        If the user enters a number that is not in the map print "Invalid Number"
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        System.out.println("Enter a number");

        map.put("First",1);
        map.put("Second",2);
        map.put("Third",3);
        map.put("Forth",4);

        int a = in.nextInt();

        if(!map.containsValue(a)){
            System.out.println("invalid number");
            System.exit(0);
        }

        for(String key: map.keySet()){
            //if(map.containsValue(a)){
            if(map.get(key) == a){
                System.out.println(key);
                break;

            }

        }






    }
}
