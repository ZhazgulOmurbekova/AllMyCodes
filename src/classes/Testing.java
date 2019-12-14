package classes;

public class Testing {
    public static void main(String[] args) {

        //instance variables
        String name = "James";
        Flag f1= new Flag();
        f1.coumtry="USA";
        f1.color="Red and White ";
        f1.size=5;
        f1.material= "wood";

       // System.out.println(f1.coumtry+" "+ f1.color);
       // f1.flap();


        Flag f2= new Flag();
        //System.out.println(f2.coumtry);
//        f1.info();
//        f2.info();

        f1.upgrade(14,"Jazgul");

    }
}
