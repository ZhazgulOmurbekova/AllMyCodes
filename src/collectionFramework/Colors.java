package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class Colors {

    /*[=] Task
    Create two Sets of Colors:
    Set 1 : "red","green","black","white"
    Set 2 : "red","yellow","white","pink"
    Go through both sets and return a String of all the colors which both Sets have*/
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("black");
        colors.add("white");
        Set<String> colors2= new HashSet<>();
        colors2.add("red");
        colors2.add("yellow");
        colors2.add("white");
        colors2.add("pink");

        String a = "";
        for (String color1 : colors){
            for (String color2 : colors2){
                if (color1.equals(color2)){
                  a += color1 + " ";
                }

            }
        } System.out.println(a);



    }
}
