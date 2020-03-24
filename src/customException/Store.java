package customException;

public class Store {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        try {
            laptop.setOs("Mac");
            laptop.turnOn();
        } catch (InvalidOSException | LAptopNotTurnException e) {
            e.printStackTrace();
        }




    }
}
