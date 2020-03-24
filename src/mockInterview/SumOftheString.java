package mockInterview;

import java.lang.reflect.Array;

public class SumOftheString {
    public static void main(String[] args) {
     String str = "I5 a3m an Soft9ware 2 Develop3er in Test6";

    // int num = Integer.parseInt(str);
        System.out.println(sumOftheStri(str));
       // System.out.println(sumOftheStri(str));
    }

    public static int sumOftheStri(String str){
        int digit =0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i) ;
            if(Character.isDigit(a)){
                digit += Integer.parseInt(a +"");
            }

        }



     return digit;
    }
}
