package interview;

import java.util.Arrays;

public class MedianModeMean {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a[] = {5,6,10,5,12 };
        int n = a.length;
        System.out.println(findMean(a, n));
        System.out.println(findMedian(a, n));
        System.out.println(mode(a, n));
    }

    public static double findMean(int a[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];

        return (double)sum / n;
    }
    public static double findMedian(int a[], int n)
    {
        Arrays.sort(a);
        if (n % 2 != 0)
            return a[n / 2];

        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }


    public static int mode(int [] arr, int n ) {
        // Arrays.sort(arr);
        int value=0;

        int maxCount  =0;

        for (int i = 0; i < n; i++) {

            int count = 0;
            for (int j = 0; j < n; j++) {

                if (arr[i] == arr[j])
                    count++;

            }

            if(count > maxCount){
                maxCount = count;
                value = arr[i];
            }
        }
        return value;
    }
}
