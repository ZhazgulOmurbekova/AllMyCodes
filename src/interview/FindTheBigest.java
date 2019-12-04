package interview;

public class FindTheBigest {
    public static void main(String[] args) {


    int []arr = {500, 20, 30, 200, 300};
    int max = 0;
    for (int i = 0; i < arr.length; i++){
        if (arr[i]> max){
            max= arr[i];
        }

    }
        System.out.println(max);
}
}