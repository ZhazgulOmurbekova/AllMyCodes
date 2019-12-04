package classes;

public class CheckCar {
    public static void main(String[] args) {
        Car car= new Car();

        car.make = "BMW";
        car.year=2019;
       car.sportEdition=true;
       car.mileage= 1223;
      // car.distance = "Newyork"

        car.drive();
        car.drive("Newy");
        car.drive(123);
    }
}
