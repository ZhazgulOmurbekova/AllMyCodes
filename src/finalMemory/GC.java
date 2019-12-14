package finalMemory;

public class GC {
    public static void main(String[] args) {
        Bag bag = new Bag();
        Bag bag1 = new Bag();

        bag = bag1;

        System.out.println("ghjk");
        System.gc();
        System.out.println("End");


    }
}
