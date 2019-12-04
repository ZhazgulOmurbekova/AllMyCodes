package classes;/*Part I 
Create a class House 
Instance variables: type, address, numRooms
Methods:
info: this method should simply print details of house.*/

public class House {
    String type;
    String address ;
    int numRoom;
    public void info(){
        System.out.println("\nType "+type);
        System.out.println("address "+address);
        System.out.println("Num of room "+numRoom);
    }

}