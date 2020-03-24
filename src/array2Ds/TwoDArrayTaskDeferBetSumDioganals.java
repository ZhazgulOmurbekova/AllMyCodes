package array2Ds;

public class TwoDArrayTaskDeferBetSumDioganals {
    public static void main(String[] args) {
/*Create a method that will take 2d array and return the
 difference between the sum of the diagonals
 */
int [][]num= TwoArrayTAskHowManyElem.creatRandom(4,4);
sumDiagonals(num);
        System.out.println(sumDiagonals(num));
    }


    public static int   sumDiagonals(int[][] arr) {
int sumOne =0;
int sumTwo=0;


     for (int i =0,j=arr.length-1; i< arr.length; i++,j--){
         sumOne+= arr [i][i];
         sumTwo +=arr[j][i];

         }
        return Math.abs(sumOne-sumTwo);
     }

    }




