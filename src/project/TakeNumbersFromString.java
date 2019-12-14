package project;
//
public class TakeNumbersFromString {
//    /**
//     * The method takes String str as an argument and returns integer of array. A str may contain
//     * symbols, special characters or any numbers. Implementation of method is that separates the
//     * number from string and store in array.
//     * @param   str String
//     * @return  arr integer of array
//     * @see sr%73ir4in*f3tg23 => [7, 3, 4, 3, 2, 3]
//     * */
//
//    // Required! Method name is: extractNum(String str)
//
public static int [] extractNum(String str){

 String nums="";
         for(int i=0; i<str.length(); i++){
        if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
        nums+=str.charAt(i)+"";
        }
        }
//            System.out.println((nums));
        String [] arr = nums.split("");
        int[] numArr = new int [arr.length];
        for (int i=0; i<arr.length; i++){
        numArr[i]=Integer.parseInt(arr[i]);
        }
    return numArr;
}
        }








