package project;

import java.util.Arrays;

public class uniqueNumArray {
    public static void main(String[] args) {
        int [] nums = {5, 7, 8, 8, 11, 55, 23, 23, 23, 54, 7, 1, 2, 2};
//       Arrays.sort(arr);
        int counter=0;
        for(int i =0; i<nums.length; i++){
            counter =0;
            for(int k=0; k<nums.length; k++){
                if(nums[i] == nums[k]){
                    counter++;
                }
            }
            if(counter == 1){
                if(i<7){
                    System.out.print((nums[i] + " "));
                }else if(i>6){
                    System.out.print((" " + nums[i]));
                }


            }
        }
                }
            }




