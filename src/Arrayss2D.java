import java.util.Arrays;

public class Arrayss2D {
    public static void main(String[] args) {

        int [][] groups = new int [3][4];

        int []num = {1,2,3};

        groups[0]=num;
        groups[1]=num;

        System.out.println(Arrays.deepToString(groups));
    }
}
