package nurlansTask;

public class FindTheMaxNum {
    public static void main(String[] args) {
        int []arr = {10, 20, 30, 200, 100};
        System.out.println(maxNum(arr));
    }

    public static int maxNum(int []num) {
        int max=0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max){
                max = num[i];

        }

        }return max;
    }
}
