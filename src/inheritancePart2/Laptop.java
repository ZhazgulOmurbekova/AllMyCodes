package inheritancePart2;

import inheritance.Dog;

public class Laptop {
    String model;
    int memorySize;
   protected String color;
   static int nomOfLaptops;

   public Laptop(){

   }
   public Dog getMyDog(){
       System.out.println("Dog in Laptop");
       Dog dog= new Dog();
       return dog;
   }



    protected void turnOn(){
        System.out.println("Laptop is turn on");
    }


}
