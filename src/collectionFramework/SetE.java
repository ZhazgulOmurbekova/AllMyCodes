package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetE {
    public static void main(String[] args) {
        Set <String> cars= new HashSet<>();
        cars.add("BMW");
        cars.add("Lexis");
        cars.add("Toyota");


        System.out.println(cars);
        cars.add("Tesla");
        System.out.println(cars);
        cars.add("Honda");
        System.out.println(cars);

        for (String a : cars){
            System.out.println(a);
        }

    }
}
