package methods;

public class ReturnMethodTaskReversString {
    /*Create a method that will accept a String and will reverse your String.
    Return the reversed String
     */
    public static void main(String[] args) {
        System.out.println(reversWor("Java is fun"));
    }

    public static String  reversWor(String str) {
        String revers="";
        for (int i = str.length() - 1; i >= 0; i--) {
            revers += str.charAt(i) ;


        }return revers;

    }
}
