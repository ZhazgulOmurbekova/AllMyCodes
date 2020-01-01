package Abstract2;

public class Townhouse extends Home {

    @Override
    public void throwParty() {
        System.out.println("Throwing party in Townhouse");
    }

    @Override
    public void lock() {
        System.out.println("Locking in Townhouse");

    }

    @Override
    public void unlock() {
        System.out.println("unlocking in Townhouse");

    }

    @Override
    public void cook() {
        System.out.println("cooking in Townhouse");

    }
   public  void shareWithNeighbor(){
       System.out.println("Sharing is caring");
   }
}
