package arrayLists;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class PrimeNumber {

    /*Create a method that will accept a number (int). Return an ArrayList of all the numbers that are prime numbers in
    the range of 1 to the given number** Hint: make a helper method first, isPrimeEx:> input: 50>
     output: [1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47]
     */
    public static void main(String[] args) {
        primeNumber(50);
        System.out.println(primeNumber(50));
    }
    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if (num % i ==0) {
                return false;
            }
        }return true;
    }

    public static ArrayList primeNumber(int num) {
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < num; i++) {
            if (isPrime(i)) {
                list.add(i);
               // return list;
            }

        }return list;
    }

}
