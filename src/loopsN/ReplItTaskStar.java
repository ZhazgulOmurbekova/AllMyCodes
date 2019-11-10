package loopsN;

public class ReplItTaskStar {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            if (i == 0 || i == 3) {
                System.out.println("******");
            } else {
                System.out.println("*    *");
            }
        }
        String singlStar="*    *";
        String stars="******";


        for (int i = 0; i <1; i++){
            System.out.println(stars);
            if(i>=1){
                break;
            }
            for (int a = 0; a <=1; a++){
                System.out.println(singlStar);
            }
            for (int s =0; s <1; s++){
                System.out.println(stars);
            }
        }
    }
}
