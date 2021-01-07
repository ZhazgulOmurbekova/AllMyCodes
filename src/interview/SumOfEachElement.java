package interview;

import java.util.*;

public class SumOfEachElement {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 0, 7, 8);
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        // System.out.println(sum);


// count the positive numbers
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count++;
            }

        }
        //   System.out.println(count);

        for (int i = 0; i < 5; i++) {
            System.out.println("jazgul");
            for (int j = 0; j < 5; j++) {
                System.out.println("Aruuke");
            }

        }

  /*
  Assignment: For Loop Basic II
Objectives:
Get comfortable writing functions only using basic building blocks of Python (i.e. using your own skills rather than relying on built-ins)
Get comfortable using for loops, functions, lists, and other data types
Biggie Size - Given a list, write a function that changes all positive numbers in the list to "big".
Example: biggie_size([-1, 3, 5, -5]) returns that same list, but whose values are now [-1, "big", "big", -5]
Count Positives - Given a list of numbers, create a function to replace the last value with the number of positive values. (Note that zero is not considered to be a positive number).
Example: count_positives([-1,1,1,1]) changes the original list to [-1,1,1,3] and returns it
Example: count_positives([1,6,-4,-2,-7,-2]) changes the list to [1,6,-4,-2,-7,2] and returns it
Sum Total - Create a function that takes a list and returns the sum of all the values in the list.
Example: sum_total([1,2,3,4]) should return 10
Example: sum_total([6,3,-2]) should return 7
Average - Create a function that takes a list and returns the average of all the values.x
Example: average([1,2,3,4]) should return 2.5
Length - Create a function that takes a list and returns the length of the list.
Example: length([37,2,1,-9]) should return 4
Example: length([]) should return 0
Minimum - Create a function that takes a list of numbers and returns the minimum value in the list. If the list is empty, have the function return False.
Example: minimum([37,2,1,-9]) should return -9
Example: minimum([]) should return False
Maximum - Create a function that takes a list and returns the maximum value in the list. If the list is empty, have the function return False.
Example: maximum([37,2,1,-9]) should return 37
Example: maximum([]) should return False
Ultimate Analysis - Create a function that takes a list and returns a dictionary that has the sumTotal, average, minimum, maximum and length of the list.
Example: ultimate_analysis([37,2,1,-9]) should return {'sumTotal': 31, 'average': 7.75, 'minimum': -9, 'maximum': 37, 'length': 4 }

   */

        double suma = 0;
        for (int i = 0; i < arr.size(); i++) {
            suma += arr.get(i);
        }
        System.out.println(suma / arr.size());


        List<Integer> list = Arrays.asList();
        double su = 0;
        Iterator<Integer> iter1 = list.iterator();
        while (iter1.hasNext()) {
            su += iter1.next();
        }
        double average = su / list.size();
        System.out.println("Average = " + average);


        System.out.println(list.size());


        /*Minimum - Create a function that takes a list of numbers and returns the minimum value in the list. If the list is empty, have the function return False.
Example: minimum([37,2,1,-9]) should return -9
Example: minimum([]) should return False*/
        int min = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!list.isEmpty()) {
                if (min > list.get(i)) {
                    min = list.get(i);
                }
            } else if (list.isEmpty()) {
                System.out.println(false);
            }


        }
        System.out.println(min);


//        int max = list.get(0);
//        for (int i = 0; i < list.size(); i++) {
//            if (max < list.get(i)) {
//                max = list.get(i);
//            } else if (list.isEmpty()) {
//                System.out.println(false);
//            }
//
//        }
//        System.out.println(max);


//        Collections.reverse(list);
//        System.out.println(list);


        for (int i = 0; i < list.size() / 2; i++) {
            Integer temp = list.get(i);//a
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
        System.out.println(list);


        //boble sort

        List<String> llist = Arrays.asList("l", "k", "a", "b");
        for (int i = 0; i < llist.size() - 1; i++) {
            if (llist.get(i).compareTo(llist.get(i + 1)) > 0) {
                String temp = llist.get(i);
                llist.set(i, llist.get(i + 1));
                llist.set(i + 1, temp);
            }


        }
        System.out.println(llist);


        int[] ar = {8, 7, 0, 5, 4, 3, 2, 1};
        for (int j = 0; j < ar.length; j++) {


            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] > ar[i + 1]) {
                    int temp = ar[i + 1];
                    ar[i + 1] = ar[i];
                    ar[i] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(ar));

        Collections.sort(llist);
        System.out.println(llist);
    }
}
