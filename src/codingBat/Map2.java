package codingBat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        String [] list = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.println(Arrays.toString(allSwap(list)));
    }

    public static  String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap();

        for (int i =0; i < strings.length; i++ ){
            //  String [] list = new String[map.get(i)];
            String s = strings[i];
            String first = s.substring(0,1);

            if(!map.containsKey(first)){
                map.put(first, i);


            }else{
                String temp = strings[map.get(first)];
                strings[map.get(first)] = s;
                strings[i] = temp;
                map.remove(first);
            }

        }
        return strings;
    }

}
