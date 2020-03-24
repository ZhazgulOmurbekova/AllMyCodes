package arrayss;

import java.util.Arrays;

public class BinarySerchs {
    public static void main(String[] args) {
        String [] groceryList = {"apple", "carrot", "orange", "cherry", "strawberry"};
        Arrays.sort(groceryList);
        //for (int i =0; i < groceryList.length; i++){
            //if (groceryList.equals("apple")){
                System.out.println("apple is "+ Arrays.binarySearch(groceryList, "apple"));
                 System.out.println("orange is "+ Arrays.binarySearch(groceryList, "orange"));
            }
        }

    //}
//}
