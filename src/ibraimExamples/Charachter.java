package ibraimExamples;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.HashMap;

public class Charachter

{
    public static void main(String[] args) {
        String s = "abrakadabra";
        HashMap<Character, Integer> map = new HashMap<>(); // map: size = 0
        for(char ch: s.toCharArray()){
            if(!map.containsKey(ch))
                map.put(ch, 1);
            else
                map.put(ch , map.get(ch) + 1);
        }
       // System.out.println(map);

        int [] arr = {1,2,4,1,2,3,2,3,1,2};
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map1.containsKey(arr[i]))
                map1.put(arr[i] ,1);
            else
                map1.put(arr[i], map1.get(arr[i]) +1);
        }
        System.out.println(map1);

    }
}
