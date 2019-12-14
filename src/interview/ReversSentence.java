package interview;

import java.util.Arrays;

public class ReversSentence {
    public static void main(String[] args) {
        String name= "Java is fun";
       // name=name.trim();
        String revers = "";
        String []arr= name.split("");

        for (int i = arr.length-1; i>=0; i--){
            revers = arr[i]+" ";


            System.out.print(revers);

        }

//    }public String reverseSentence(String sentence) {
//
//
//        sentence = sentence.trim();
//        String reverse="";
//        String [] newArr=sentence.split(" ");
//        for(int i=newArr.length-1; i>=0; i--){
//            reverse+=newArr[i] + " ";
//        }
//        reverse = reverse.substring(0,reverse.length()-1);
//        return reverse;
   }

}
