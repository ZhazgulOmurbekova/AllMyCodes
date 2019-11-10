package replitTask;

import java.util.Scanner;

public class MethodsplitPersonInfo {
    public static void main(String[] args) {

            Scanner inp = new Scanner(System.in);
            String s = inp.next();

            person(s) ;
    }
    public static void person(String info)
    {
//      String [] name = info.split(",");
//        System.out.println("person name: "+ name [0]+ "last name: "+ " age: " );
        //your code here
String word1= info.substring(0,(info.indexOf(",") ));
String word2= info.substring(info.indexOf(","+1), info.lastIndexOf(","));
String word3= info.substring(info.lastIndexOf(",")+1);

        System.out.println("person name: "+ word1+ "last name: "+word2+ " age: "+ word3);

    }//end person

}
