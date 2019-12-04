package staticClass;

public class LexusCheck {
    public static void main(String[] args) {
        Lexus car = new Lexus("Lexus", 2017);
        car.mileage=1234;

        Lexus.evaluateCar(car);

    }
}
