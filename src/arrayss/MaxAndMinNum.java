package arrayss;

public class MaxAndMinNum {
    public static void main(String[] args) {
        int[] arr = {500, 25, 33, 35, 66, 44, 78, 95, 98, 1, 500};
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i]> max){
                max= arr[i];
        }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min " +min);
       System.out.println("max "+max);
    }
}
