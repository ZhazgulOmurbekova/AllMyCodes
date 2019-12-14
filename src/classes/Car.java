package classes;
/*1. Create a class Car
Instance variables: make, year, sportEdition, mileage
Methods:
drive -> print “%year %make is driving” -> increment mileage by 10
drive -> accepts String(destination) -> print “%year %make is driving to %destination”
-> increment mileage by 10
drive -> accepts integer(mile) -> print “%year %make is driving %mile miles”
-> increment mileage by given mile.*/
public class Car {
    String make;
    int year;
    boolean sportEdition;
    int mileage;
    String distance;
    public void drive(){
        System.out.println(year+" "+ make+" is driving ");
        mileage+= 10;
        System.out.println(" Now my milages is " + mileage);

    }
    public void drive(String destination){
        System.out.println(year+" "+make + " is driving to "+ destination);
        mileage+=10;
        System.out.println(" Now my milages is " + mileage);
    }
    public void drive (int mile ){
        System.out.println(year+" "+ make + " is driving "+mile+" miles ");
        mileage+=mile;
        System.out.println(" Now my milages is " + mileage);
    }

}
