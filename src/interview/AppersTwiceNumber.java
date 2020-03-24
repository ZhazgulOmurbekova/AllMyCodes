package interview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AppersTwiceNumber {

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 3,3, 1, 4};
        //appears(nums);

        System.out.println(nonDuplicate(nums));

    }


    public static int nonDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int number : nums) {
            if (!map.containsKey(number)) {
                map.put(number, false);
            } else {
                map.put(number, true);
            }
        }
        for (Integer key : map.keySet()) {
            if (!map.get(key))  return key;


        }return 0;

    }

    public static void appears(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {


                if (arr[i] != arr[j]) {

                }

            }
        }
    }
}
