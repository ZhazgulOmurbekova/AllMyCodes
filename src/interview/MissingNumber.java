package interview;

public class MissingNumber {
    public static void missingNum(int [] nums){
        for (int i = 0; i < 10 ; i++) {
            boolean b = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j]==i){
                    b = true;
                }
            }
            if(b != true){
                System.out.println("missing number "+ i);

            }
        }

    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,9};
        missingNum(nums);

    }
}
