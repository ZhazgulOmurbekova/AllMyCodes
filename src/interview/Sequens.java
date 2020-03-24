package interview;

public class Sequens {

    public static void main(String[] args) {
        ;
        System.out.println(sequens("()"));
    }
    public static boolean sequens(String str ) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)){

            }
            else{
                return false;
            }

        } return true;
    }
}
