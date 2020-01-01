package Abstract2;

public class SingleHouse extends Home{
   String garageType;
    @Override
    public void throwParty() {
        System.out.println("SingleHouse is throwParty ");
    }

    @Override
    public void lock() {
        System.out.println("SingleHouse is lock ");

    }

    @Override
    public void unlock() {
        System.out.println("SingleHouse is unlock ");

    }

    @Override
    public void cook() {
        System.out.println("SingleHouse is cook ");

    }

    public String  toString(){
       String result = super.toString() + "\n garage type " + this.garageType;
//        throwParty();
//        lock();
//        unlock();
//        cook();
        return result;
    }

   public void  cutGrass(){
       System.out.println("SingleHouse is cutting the grass ");

   }

    public void  shovelSnow(){
        System.out.println("SingleHouse is shovel grass ");

    }
}
