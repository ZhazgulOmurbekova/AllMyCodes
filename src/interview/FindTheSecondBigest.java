package interview;

public class FindTheSecondBigest {
    public static void main(String[] args) {
        int []arr = { 20, 400, 480, 300, 450,500, 460};

        int max=0;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                secondMax=max;
                max= arr[i];
            }
           // for (int j = 0; j < arr.length; j++){
                if (arr[i] > secondMax && arr[i]< max){
                    secondMax= arr[i];
                }
            }

        System.out.println(secondMax);
    }
}
