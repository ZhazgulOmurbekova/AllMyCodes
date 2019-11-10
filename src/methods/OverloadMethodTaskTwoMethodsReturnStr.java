package methods;

public class OverloadMethodTaskTwoMethodsReturnStr {
    /*Create a method that will accept two Strings. Return a new String that has the firstWord then
    the secondWord and then the firstWord again

> input: “day”, “name”
> output: “daynameday”

Overload the method above to now accept the two Strings and an integer. The integer given
 tells you how many times your first word should show up in your new String. Your first words need to always be separated by the second word.

 > input: “day”, “name”, 3
> output: “daynamedaynameday”
Collapse*/
    public static void main(String[] args) {
//firstWord("day","name");
//firstWord("day", "name",5);
        System.out.println(firstWord("day","name",4));


    }

    public static  String firstWord(String firstword, String  secondWord) {
       return firstword+secondWord+firstword;

    }

    public static String firstWord (String firs, String secomd, int time) {
       if (time ==0){
           return "";
        }

    String word ="";

       for (int i =0; i<time; i++){
           word+=firs;
//          if (i==time-1){
//               break;
//           }
           word+=secomd;
       }
       return word.substring(0,word.length()-secomd.length()) ;
}
}