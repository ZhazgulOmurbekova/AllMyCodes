package inheritancePart2;

public class Macbook extends Laptop {
    public Macbook() {
        //super("model");
        System.out.println("Mac constructor");
    }

    public void appleId() {
        super.memorySize = 45;

    }

    public static void main(String[] args) {
        Macbook mac = new Macbook();
       // mac.color = "Gray";

    }

}
