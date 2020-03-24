package codingBat;

import java.util.HashMap;
import java.util.Map;

public class MapFirst {
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));

        }
        map.remove("c");
        return map;
    }


    public Map<String, String> mapAB2(Map<String, String> map) {
        // if(map.containsKey("a") && map.containsKey("b") ){
        //   map.put("a" , "");
        //   map.put("b", "");

        // }
        // if( map.containsKey("b")){
        //   map.put("b", "");
        // }
if(map.equals("a") && map.equals("b")){
    map.remove("b");
    map.remove("a");
}
        return map;
    }
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for(int i =0; i < map.size(); i++ ){
            if(strings[i].equals("0")){

            }
        }return map;
    }
    public Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
          map.put("ab", map.get("a") + map.get("b"));

        }

        return map;
    }

    public Map<String, String> topping2(Map<String, String> map) {
        if(!map.get("ice cream").isEmpty()){

            map.put("yogurt", map.get("ice cream"));
            map.put("spinach","nuts");

        }


        return map;
    }
    public Map<String, String> mapAB4(Map<String, String> map) {
        if(map.get("a").length() > map.get("b").length()){
            map.put("c", map.get("a"));
        }
        if(map.get("a").length() < map.get("b").length()){
            map.put("c", map.get("b"));
        }return map;
    }


    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap();
        int count =0;
        for(String a: strings){
            if(map.get("a").equals(a)){
                count++;
                map.put(a, count);
            }

        }return map;
    }


    public static void main(String[] args) {
        MapFirst map = new MapFirst();

        String [] arr = {"aa", "bb", "cc", "cCC", "d"};
        System.out.println(map.firstChar(arr));
    }
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap();

        for(int i = 0; i < strings.length; i++){
            map.put(strings[i].charAt(0)+"", "");
        }
        for (int j =0; j < strings.length; j++){
            map.put(strings[j].charAt(0)+"", map.get(strings[j].charAt(0)+"")+strings[j]);
        }

        return map;
    }


}