package interview;

public class FindTheSecondBigest {
    public static void main(String[] args) {
        int []arr = {500, 20, 400, 200, 300};

        int max=0;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max= arr[i];
            }
            for (int j = 0; j < arr.length; j++){
                if (arr[j] > secondMax && arr[j]< max){
                    secondMax= arr[j];
                }
            }
        }
        System.out.println(secondMax);
    }
}
