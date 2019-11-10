package methods;

public class MethodArrayTaskSameFormat {
    public static void main(String[] args) {
/*Write a method that accepts an int array.
 Print out the array using the same format as Arrays.toString method.
 DO NOT USE THE toString() METHOD.
[element, element, element]*/
        int [] arr2 = {-1, 3, -4, -2, 32, 2, -22, 1};

           sameFormat(arr2);
    }

    public static void sameFormat(int [] arr) {
        String result="[";

      for (int num: arr){

          result+=num+", ";


      }
      result=result.substring(0,result.length()-2)+"]";
        System.out.println(result);


    }
}
