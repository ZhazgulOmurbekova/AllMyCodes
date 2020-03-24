package mockInterview;

public class FibonacciNumbers {
    public static void main(String[] args) {
       fibonacci(10);

    }public static void fibonacci(int num){
        int first = 0;
        int second =1;
        int sum = 1;
        System.out.print(0 + " ");
        for (int i = 0; i < num; i++) {

            System.out.print(" "+sum);
            sum = first + second;
            first = second;
            second= sum;


        }
    }
}
