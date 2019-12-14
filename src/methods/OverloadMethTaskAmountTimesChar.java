package methods;

public class OverloadMethTaskAmountTimesChar {
    /*Create a method that will accept two Strings. Return true if the first string
    begins with the second String.
     Return false if it does not.

Overload the method to accept a two Strings and a number.
 Return true if the second String is found inside of your first String the amount of
 times equal to your number parameter.
input: “jamesjajl”,”ja", 2
output: true*/
    public static void main(String[] args) {

        //System.out.println(parameters("james","jamesjfh"));
        System.out.println(parameters("Djamesjal", "ja",2));
    }

    public static boolean parameters (String first , String second ) {


        return first.toLowerCase().startsWith(second.toLowerCase());

    }

    public static boolean parameters(String word, String start, int times ) {
     int count =0;
     for (int i=0; i<word.length()-start.length()+1; i++){
         String sub= word.substring(i, i+start.length());
         System.out.println(sub);
         if (sub.equals(start)){
             count++;
         }
     }
    if (times==count) return true;

    return false;
    }


    }
