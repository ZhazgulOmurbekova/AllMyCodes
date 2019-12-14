package nestedLoops;

public class ReplitOddNumbers {
    public static void main(String[] args) {
        int sum =0;

        for (int i =0; i <=19; i++){

            while (i%2==1){
                sum+=i;

                System.out.println(sum+"");
                break;
            }
    }}
}
