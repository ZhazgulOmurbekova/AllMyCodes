package collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
       Map<String,Integer> gradeScale = new HashMap<>();
       gradeScale.put("A", 90);
       gradeScale.put("B", 80);
       gradeScale.put("C", 70);
        gradeScale.put("F", 50);
       gradeScale.put("D", 60);


        System.out.println(gradeScale);
        System.out.println(gradeScale.get("A"));
       gradeScale.remove("C");
        System.out.println(gradeScale);

        System.out.println(gradeScale.containsKey("A"));
        System.out.println(gradeScale.containsKey("G"));
        System.err.println(gradeScale.containsValue(50));
        System.err.println(gradeScale.containsValue(60));

        Set<String> keys = gradeScale.keySet();

        for(String  key : keys){
            System.out.println(key);
        }
        System.out.println();

        for (String a : gradeScale.keySet()){
            if(a.equals("C")){
               // gradeScale.remove(a);
            }
            System.err.println(a + " " + gradeScale.get(a));
        }


        System.err.println(keys);




        //numsAndWords.put()
    }
}
