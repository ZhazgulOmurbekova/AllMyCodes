package Abstract2;



public class Apartment extends Home {

    @Override
    public void throwParty() {
        System.out.println("Throwing party in Apartment");
    }

    @Override
    public void lock() {
        System.out.println("Locking in Apartment");

    }

    @Override
    public void unlock() {
        System.out.println("unlocking in Apartment");

    }

    @Override
    public void cook() {
        System.out.println("cooking in Apartment");

    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
