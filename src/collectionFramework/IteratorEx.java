package collectionFramework;

import java.util.*;

public class IteratorEx {
    public static void main(String[] args) {
        Set<String> names= new HashSet<>(Arrays.asList("James", "Sara", "Adam", "Ben"));
        Set<Integer> names1= new HashSet<>(Arrays.asList(1,3,4,5,6));

        Iterator<String> it = names.iterator();
       while (it.hasNext()){
           String name = it.next();
           System.out.println(name);

           if(name.equals("Ben")){
               it.remove();
           }

       } System.out.println(names);
    }
}
