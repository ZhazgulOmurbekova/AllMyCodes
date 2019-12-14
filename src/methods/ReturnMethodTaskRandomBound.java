package methods;

import java.util.Arrays;
import java.util.Random;
/*Create a method that will generate a random int array.
The method takes the size of the array and the bound of the random numbers.
 Return the random array
 */

            public class ReturnMethodTaskRandomBound {
                public static void main(String[] args) {
                    System.out.println(Arrays.toString(rendomBound(5,100)));
                }


                public static int [] rendomBound(int size , int bound){
                    //int rand = new Random().nextInt(arr.length);
            int []arr = new int [size];
            Random random = new Random();

            for (int i =0; i< size; i++){
                int ran = random.nextInt(bound);
                arr[i]=ran;
            }
            return arr;

    }




}
