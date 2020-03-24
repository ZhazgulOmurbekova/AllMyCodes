package mockInterview;

public class ReversInt {
    public static void main(String[] args) {
        System.out.println(revers(123));
    }

    public static int revers (int num){

       int  number= num;
       int  revers = 0;
       while (number != 0){
           int last = number % 10;
           revers = revers * 10 + last;
           number /=10;

       }return revers;
    }
}
