package inheritancePart2;

public class Animal
{
    static int numOfAnimal;
    String name;

    static {
        numOfAnimal = 20;
    }


    public Animal(){
        name = "bobby";
    }



    public void eat(){
        System.out.println("Eat rice");
    }

    public void sleep(){
        System.out.println("Sleep");

    }

    public void drink(){
        System.out.println("Drink");
    }

    public void see(){
        System.out.println("SEE");
    }
}
