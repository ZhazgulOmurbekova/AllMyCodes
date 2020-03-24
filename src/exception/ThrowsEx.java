package exception;

public class ThrowsEx {
    public static void main(String[] args) throws InterruptedException{
     //  Dog.bark();

       // Thread.sleep(1000);
        System.out.println(3);
        Dog dog = new Dog();
        try{
        dog.setAge(4);}
        catch (Exception e ){

            e.printStackTrace();
       } System.out.println(dog.age);
    }
}
