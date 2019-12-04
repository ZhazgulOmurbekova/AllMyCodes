package finalMemory;



public class BlueExample {

    final String name = "Jason";

    public void get(){
        System.out.println(name);
    }

    public static void main(String[] args) {
      final  int k ;
        System.out.println("program");
        k=23;
        System.out.println(k);
        System.out.println();

        BlueExample b = new BlueExample();

        System.out.println(b.name);

        Bag bag0 = new Bag();
        System.out.println(bag0.color);
        System.out.println();
        Bag bag = new Bag ("Black");
        Bag bag2 = new Bag ("White");

        System.out.println(bag.color);
        System.out.println(bag2.color);

        System.out.println();
        hi();
    }

    public static void hi(){
        System.out.println( "Hi");
        hi();
    }
}
