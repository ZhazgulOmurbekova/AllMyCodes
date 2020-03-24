package array2Ds;

public class MultiDimenTable {
    public static void main(String[] args) {
        int [][] numbers = {
                {44,62,12,51,33},
                {33,66,54,12,25},
                {65,78,56,42,22},
                {14,12,15,16,14}};

        System.out.println(numbers[0][1]);
        System.out.println(numbers[2][3]);

      for (int row = 0; row < numbers.length; row++){
              for (int col = 0; col < numbers[row].length; col++) {
                  System.out.print(numbers[row][col] + "\t");


              }System.out.println(" ");
          }

      }

    }

