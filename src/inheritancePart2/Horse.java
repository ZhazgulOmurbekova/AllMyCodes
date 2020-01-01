package inheritancePart2;

public class Horse extends Goat{

    public void eat(){
        System.out.println("Eat");
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

    public static void main(String[] args) {
        Horse nu = new Horse();

        System.out.println(nu.name);
        System.out.println(numOfAnimal);
    }

}
