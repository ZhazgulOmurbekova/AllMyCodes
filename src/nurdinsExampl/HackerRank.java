package nurdinsExampl;

public class HackerRank {
    public static void main(String[] args) {
        int a=0;
        int b=2;
        int n =10;

        int s=a;

        for (int i =0; i < n; i++){

            s+= Math.pow(2,i)*b;
            System.out.println(s+" ");
        }
        System.out.println();
    }
}
