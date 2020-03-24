package interview;

public class MissingNumbers {
    public static void main(String[] args) {
        int [] nums = {1,2,3,6,4,9};
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max){
                max = nums[i];

            }
        }

        for (int i = 0; i < max; i++) {
            boolean check = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    check = true;

                }
            }
            if (check != true) {
                System.out.println("missing number" + i);

        }


        }
    }
}
