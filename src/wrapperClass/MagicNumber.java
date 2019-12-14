package wrapperClass;

import java.util.ArrayList;
import java.util.Random;
/*TASK:
Create a class MagicNumber
Instance variable list of integers.
create a method generateNumbers. This method should accept integer for size and
it needs to generate given size random numbers and store in list of integers.
 */


public class MagicNumber {

    ArrayList<Integer> list = new ArrayList<>();


    public void generateNumber(int size ){
        Random random = new Random();
        for (int i = 0; i < size; i++){
        Integer randomNum= random.nextInt(1000);

        list.add(randomNum);
    }
    }public void generateEvens(int size){
         Random random = new  Random();
         list.clear();
         while(true){
             int i = random.nextInt(100);
            if (i%2==0){
                list.add(i);
                //list.add(random.nextInt(100));
            }if (list.size()==size){
                break;
             }
        }
    }
    public static void main(String[] args) {
        MagicNumber magNum = new MagicNumber();
        magNum.generateNumber(12);
        System.out.println(magNum.list);

        magNum = new MagicNumber();
        magNum.generateEvens(10);
        System.out.println(magNum.list);
    }

}
