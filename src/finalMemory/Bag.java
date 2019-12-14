package finalMemory;

public class Bag {
    final String color;

    final int size;
    final static int totalBags;
    final static  String model;
     {

        size = 4;

    }


    static {
        model = "MK";
        totalBags =45;
    }

    public Bag (){
        this.color = "Red";

    }

    public Bag (String color ){
        this.color = color;
    }
}
