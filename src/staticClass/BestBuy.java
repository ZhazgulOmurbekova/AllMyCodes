package staticClass;

public class BestBuy {
    String location ;
    static int numOfComputers;
    static String day;

    static  {

       numOfComputers=511;
        System.out.println("run this first ");
        day="monday";

    }
    static {
        System.out.println("Second");

        if (day.equals("monday")){
            numOfComputers=60;
        }else{
            numOfComputers=20;
        }
       // numOfComputers=100;
    }
    public static void printComp(){
        System.out.println(numOfComputers);
    }
}
