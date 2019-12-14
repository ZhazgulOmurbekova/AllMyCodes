package Arrayss;

public class Cars {
    public static void main(String[] args) {
        String [] carBrands = {"Mercedes", "BMW", "Toyota", "ferrari"};
        for (int i = 0; i < carBrands.length; i++){
            if (carBrands[i].equals("Mercedes")) {

                System.out.println(carBrands[i] + ": Luxury - Comfort");


            }else if (carBrands[i].equals("BMW")){
                System.out.println(carBrands[i] + ": Luxury - Sport");
             }
            else if (carBrands[i].equals("Toyota")){
                System.out.println(carBrands[i] + ": Reliable cheap");

            } else if (carBrands[i].equals("ferrari")){
                System.out.println(carBrands[i] + ": Supper fast");

            }
        }
    }
}
