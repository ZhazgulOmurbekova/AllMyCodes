package interview;

public class MissingNumbers {
    public static void main(String[] args) {
        int [] nums = {1,2,3,6,4,9};

        int temp =0;
        for (int k = 0; k < nums.length; k++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j] > nums[j + 1])
                    temp = nums[j + 1];
                nums[j + 1] = nums[j];
                nums[j] = temp;

            }
        }


        for (int i = 0; i < 10; i++) {
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
