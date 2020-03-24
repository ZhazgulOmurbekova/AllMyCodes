package mockInterview;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int [] arr = {2,5,2,9,2};
        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int [] arr){

        int max = arr[0];
       int  second = max;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max ){
                max = arr[i];

            }
        }
            for (int j = 0; j < arr.length; j++) {

            if (arr [j] > second && arr[j]< max){
                second = arr[j];
            }

        }
        return second;
    }
}
