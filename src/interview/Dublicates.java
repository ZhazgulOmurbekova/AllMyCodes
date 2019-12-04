package interview;

import java.util.Arrays;

public class Dublicates {
    public static void main(String[] args) {
        int []arr = {500, 20, 400, 200, 300, 20, 500, 10, 10};
        int [] newArr = new int [arr.length];
        int dubl = 0;
        for (int i = 0; i <  arr.length; i++){
            int count =0;

            for (int j = 0; j < arr.length; j++){

                if (arr[i] == arr[j]){
                    count++;
                }if ( count > 1){

                    dubl = arr[j];
                    newArr[j]= arr[i];
                }
            }

        }
        System.out.println(dubl);
        System.out.println(Arrays.toString(newArr));

    }
}

