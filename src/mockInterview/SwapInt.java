package mockInterview;

public class SwapInt {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        a = b + a;
        b = a - b ;
        a = a - b ;
        System.out.println(a + " " + b);
    }
}
