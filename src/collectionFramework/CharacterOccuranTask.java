package collectionFramework;

import ibraimExamples.Student;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccuranTask {
    public static void main(String[] args) {


        String str = "apple";

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {

            String ch = String.valueOf(str.charAt(i));

            if(!map.containsKey(ch)){
                map.put(ch, 1);
                continue;
            }
            map.put(ch, map.get(ch) + 1);
        }
        System.out.println(map);


    }
}
