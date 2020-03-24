package array2Ds;

public class TwoDArrayTaskBiggestNumSum {
    public static void main(String[] args) {
        /*Create a method that takes a 2D array and return the index of the inner array which has the biggest sum of its elements*/
        int [][] arr= {{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}};
        //System.out.println(biggestNum(arr));
        System.out.println(biggestSum(arr));
    }

    public static int biggestSum(int [][] arr) {
        int index =0;
        int biggest =0;
for (int i =0; i< arr.length; i++){
    int sum =0;
    for (int j =0; i<arr[i].length; j++){
        sum += arr[i][j];
    }
    if (sum >biggest){
        biggest=sum;
        index=i;
    }
}
return index;
    }
}
