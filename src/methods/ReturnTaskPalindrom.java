package methods;

public class ReturnTaskPalindrom {
    /*Create a method that will take a String as a parameter and return
     if the String is palindrome or not
     */
    public static void main(String[] args) {
        System.out.println(palindromStrin("civic"));
        System.out.println(isPalindronArr("somthing"));
    }

    public static boolean isPalindronArr(String str) {
        char[] arr =str.toLowerCase().toCharArray();
        for (int i =0; i < arr.length/2; i++){
            if (arr[i]== arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }

    public static boolean palindromStrin(String str) {

        if  (ReturnMethodTaskReversString.reversWor(str).equals(str)){
            return  true;
        }
       else  {

            return false;

        }


    }
}
