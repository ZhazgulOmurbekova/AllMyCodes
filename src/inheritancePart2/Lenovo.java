package inheritancePart2;

import inheritance.Dog;

public class Lenovo extends Laptop{

    @Override
    public void turnOn(){
        System.out.println(this.model + " is turning on in class lenovo");
    }
    @Override
    public Dog getMyDog(){


        System.out.println("Dog in lenovo");
        Dog dog= new Dog();
        return dog;
    }

    public static void main(String[] args) {
      //  Laptop lap = new Laptop();

    }
}
