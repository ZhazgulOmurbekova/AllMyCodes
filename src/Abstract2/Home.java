package Abstract2;
/*Abstract class Home.
Instance variables: numOfRooms, address, maxNumOfGuests;
Methods: throwParty, lock, unlock, cook.
Override toString method. Build and return all info about Home.   Concrete classes: Apartment, Townhouse, SingleHouse.
Townhouse additional methods: shareWithNeighbor.
SingleHouse additional methods: cutGrass, shovelSnow.
SingleHouse additional variable: garageType.
Override toString method and include garageType info.*/

public abstract class Home {

    int numOfRooms;
    String address;
    int maxNumOfGuests;

    public abstract void throwParty();
    public abstract void lock();
    public abstract void unlock();
    public abstract void cook();

    @Override
    public String  toString(){
       String result = "\n Address is "+this.address  + "\n Number of rooms "+ numOfRooms + " \n Max Number Of guests " + maxNumOfGuests;
//        throwParty();
//        lock();
//        unlock();
//        cook();
        return result;
    }




}
