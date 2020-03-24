package eachLoopsArr;

public class EachTaskUpperCase {
    public static void main(String[] args) {
        /*Given a String array with value of:
"Bread", "cucumber", "Apples", "Orange", "cookies", “Cake"
Print out how many of the words begin with uppercase letters*/
        String []words= {"Bread", "cucumber", "Apples", "Orange", "cookies", "Cake"};
int count=0;
        for (String justWord: words){

            char start=justWord.charAt(0);
           // if (Character.isUpperCase(start));{//-> method takes character
            if (start>=65&& start<=90){
                count++;
            }
        }
        System.out.println(count);
    }
}
