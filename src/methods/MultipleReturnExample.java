package methods;

public class MultipleReturnExample {

    public static int checkNumber(int num){
        if (num < 0){
            return 0;
        }
        else {
            return num;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(-4));
    }
}
