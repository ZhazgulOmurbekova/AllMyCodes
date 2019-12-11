package inheritance;

import encapsulation.App;

public class Dog   {

    //Dog is - a App.
    //Pet
    // class Dog extends Pet
       String name;
       String breed;
       double weight;
       String color;
       int age;


       public void bark(){
           System.out.println("Dog is barking");
       }

       public void eat(){
           System.out.println("Eating");
       }

}
