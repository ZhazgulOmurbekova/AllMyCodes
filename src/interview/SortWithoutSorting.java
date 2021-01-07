package interview;

import java.util.Arrays;

public class SortWithoutSorting {
    public static void main(String[] args) {
        int [] a = {7,5,3,3,5,6};

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if(a[j] > a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);

        }
        System.out.println(Arrays.toString(a));
        System.out.println(a[0]);

    }
}
