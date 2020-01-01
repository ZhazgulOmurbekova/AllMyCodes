package Abstract2;

public class CheckHouses {
    public static void main(String[] args) {
        SingleHouse sh = new SingleHouse();
        sh.garageType= "regular";
        sh.address ="some where";
        sh.maxNumOfGuests = 3;
        sh.numOfRooms = 5;
        System.out.println(sh.toString());

    }

}
