package methods;

public class OverleadMethodTaskReturnFirstIndex {
    /*Create a method that takes a String, it will print the first characters
Then overload the method to take a String, and an index. And print the character found at that index
Then overload the method to take a String and two numbers.
Take the substring of the String based on the two numbers provided. Return the length of the substring String
     */
    public static void main(String[] args) {

       printString("hello");
       printString("hello",4);

       //int a= printString("hello ",1,2);
        System.out.println( printString("hello ",1,2));
    }

    public static void printString(String str) {
        System.out.println(str.charAt(0));

    }

    public static void printString(String str, int index) {
        System.out.println(str.charAt(index));

    }
    public static int printString (String str, int indexOne, int indextwo) {
        return str.substring(indexOne, indextwo).length();
}
}