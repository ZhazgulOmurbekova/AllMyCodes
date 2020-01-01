package inheritancePart2;

public class Goat extends Animal{

    static int numOfAnimal ;
    String name;

    static {
        numOfAnimal = 9;
    }

    public Goat(){
        super();
        name = "jazgul";
    }

@Override
    public void eat(){
        System.out.println("Eat grechka");
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
    Animal goat = new Animal();
    Goat got = new Goat();

        System.out.println(numOfAnimal);
        System.out.println(got.name);
    }
}
