package inheritance;

public class PetSmart {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Huskey huskey = new Huskey();
        huskey.name = "Rex";
        huskey.age = 1;
        huskey.bark();
        System.out.println(huskey.name);
        huskey.furType = "jsd";
       huskey.liveInColed();
        System.out.println(huskey.furType);
        System.out.println();

        CodingBootcamp cbt = new CodingBootcamp();
        cbt.name = "Cybertek";
        cbt.hostEvent("31 December");
        cbt.giveHW();



    }
}
