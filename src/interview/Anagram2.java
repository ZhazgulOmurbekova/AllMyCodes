package interview;

import javax.swing.plaf.IconUIResource;

public class Anagram2 {
    public static void main(String[] args) {
        String a = "march";
        String b ="marcha";

        System.out.println(anagram(a,b));
    }



    public static boolean anagram (String a , String b ){

        if (a.length() != b.length()){
            return false;
        }
        int count =0;
        for (int i = 0; i < a.length(); i++) {

            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)){
                    b.replaceFirst(b.charAt(j)+"", "");
                    count++;
                    break;
                }

            }

        }if(a.length() == count){
            return true;
        }else{
            return false;
        }







    }
}
