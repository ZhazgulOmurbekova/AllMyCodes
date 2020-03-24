package exception;

public class City {
    public static void main(String[] args) {
        Driver d = new Driver ();
        try {
            d.setName(" james bond");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(d.getName());

    }
}
