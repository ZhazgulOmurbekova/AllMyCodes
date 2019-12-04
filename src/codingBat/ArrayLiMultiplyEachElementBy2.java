package codingBat;

import java.util.ArrayList;
import java.util.List;

public class ArrayLiMultiplyEachElementBy2 {
//    public static void main(String[] args) {
//        List<Integer> list= new ArrayList<>();
//
//        list.add(12);
//        list.add(2);
//        list.add(3);
//
//        System.out.println(doubling);
//    }
    public List<Integer> doubling(List<Integer> nums) {

        List<Integer> list= new ArrayList<>();
        for (int i =0; i< nums.size(); i++){

            list.set(i,nums.get(i*2));

        } return list;
    }public List<Integer> square(List<Integer> nums) {
        List<Integer> list= new ArrayList<>();
        for (int i =0; i< nums.size(); i++){

            list.add(nums.get(i)*nums.get(i));

        } return list;
    }

}
