package interview;

import java.security.PublicKey;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        String a = "march";
        String b = "charma";
        boolean check = true;
        if (a.length() != b.length()){
            System.out.println( check = false);

        }


        int count = 0;
        for (int i = 0; i < a.length() ; i++) {

            for (int j = 0; j < b.length() ; j++) {
                if(a.charAt(i) == b.charAt(j)){
                    count++;
                    b = b.replaceFirst(b.charAt(j) + "", "");
                  break;
                }

            }
        }
        if (count == a.length()){

            System.out.println(check = true);
        }else{
           ;
            System.out.println( check = false);
        }
    }



    public void sumOfList(){

        int [] arr = {1,2,3,4,5};
        int [] newArr = new int[1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] += arr[i];

        }
        System.out.println(newArr);

    }
}
