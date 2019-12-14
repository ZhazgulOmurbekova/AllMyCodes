package methods;

public class MethodsTaskIntNotEqualsString {
    public static void main(String[] args) {
        /*Create a method that accepts String and int.
Check if string length is same as given integer.
Print "Equal" if they are equal. Print "Not equal" if string length and given integer are not equal.*/
        name("word", 4);
    }

    public static void name  (String word, int num) {
        if (word.length()==num){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }

    }
}
