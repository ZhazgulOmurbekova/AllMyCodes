package replitTask;

public class MethodStars {


    public static void main(String[] args) {

        printHollowRect();

    }


    public static void printHollowRect()
    {
        // your code here

        for (int i=0; i< 5; i++){
            for (int j=0; j <5; j++){
                if (i >=1&& i <=3&&j >=1 && j<=3){

                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
}}
