package interview;

public class ReverseString {
    public static void main(String[] args) {
        String name="Jazgul";
        String rever="";
        for (int i =name.length()-1; i >= 0; i--){
            rever= name.toLowerCase().charAt(i)+" ";
            System.out.print(rever);
        }
    }
}
