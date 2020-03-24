package arrayss;

import java.util.Arrays;

public class ArraySortTaskUnique {
    public static void main(String[] args) {

        /*Given an array of values: 23, 1, 34, 3, 54, 54, 51
Print the biggest two values. Only Unique values
> The result here should be:
54
51*/

        int []numbers = {23, 1, 34, 3, 54, 54, 51};


        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        String checked = "";
        int count = 0;
        for(int i = numbers.length-1; i >= 0; i--) {
            if(count == 2) {
                break;
            }
            if(!checked.contains(numbers[i]+ "")) {
                System.out.println(numbers[i]);
                checked += numbers[i] + " ";
                count++;
            }
        }
    }
}
