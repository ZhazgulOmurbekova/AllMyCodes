package codingBat;

public class Middle2Array {
    public static void main(String[] args) {

    }public int[] makeMiddle(int[] nums) {
        int [] arr= new int [2];

        for  (int i =0; i<nums.length; i++){
         if (nums.length%2==0){
             int a= nums.length/2;
             int mid1= nums.length/2-1;

             arr[i]= mid1+a;
             return arr;
         }
        }
return nums;
        }

    }
