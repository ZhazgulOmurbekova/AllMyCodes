package Array2Ds;

public class TwoArrTaskGlassShape {
    public static void main(String[] args) {
        /*Create a method that will sum the values from a 2D array in an hour glass shape. Return the highest sum.*/
        int [][]array = new int [6][6];
        System.out.println(hourglassSum(array));
    }
    static int hourglassSum(int[][] arr) {
        int sum = Integer.MIN_VALUE;
        for(int i=0; i < arr.length-2; i++) {

            for(int j=0; j < arr[i].length-2; j++) {
                int temp = 0;
                temp = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                temp += arr[i+1][j+1];
                temp += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(temp > sum) {
                    sum = temp;
                }
            }
        }
        return sum;
    }
    }

