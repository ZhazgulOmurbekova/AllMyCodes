package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class SpeakerExam {

    public static void main(String[] args) {
        ArrayList<String> name= new ArrayList<>();


        name.add("Jason");
        name.add("Adam");
        name.add("Jazgul");
        name.add("Mikail");
        name.add("Nurgazy");

        name.set(name.size()-2,"gfhjd");
        name.add(name.size()/2,"John");

        name.remove(0);
        System.out.println(name);
        System.out.println(name.get(1));

        ArrayList<Cat>catsForSale= new ArrayList<>();
        Cat cat1= new Cat();
        cat1.color="white";
        cat1.age=3;

        catsForSale.add(cat1);

       // ArrayList<Cat>catsF= new ArrayList<>();
         cat1= new Cat();
        cat1.color= "blue";
        cat1.age= 1;



        catsForSale.add(cat1);

        catsForSale.get(1);

        for (int i =0; i < catsForSale.size(); i++){

            System.out.println("Cat # "+(i+1));
            System.out.println("Color "+catsForSale.get(i).color);
            System.out.println("Age: "+ catsForSale.get(i).age);
            System.out.println();
        }
    }
}
