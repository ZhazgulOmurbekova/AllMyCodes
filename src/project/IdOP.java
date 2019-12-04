package project;

public class IdOP {

    /*
     * The method takes String str as an argument and returns integer of array. A str may contain
     * symbols, special characters or any numbers. Implementation of method is that separates the
     * number from string and store in array.
     * @param   str String
     * @return  arr integer of array
     * @see sr%73ir4in*f3tg23 => [7, 3, 4, 3, 2, 3]
     * */

    // Required! Method name is: extractNum(String str)
    public static int[] extractNum(String str) {
        String nums = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                nums += str.charAt(i) + "";
            }
        }
//            System.out.println((nums));
        String[] arr = nums.split("");
        int[] numArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
        }
        return numArr;
    }




    /*
     * The method takes word1 and word2 and returns boolean. A method check if word1 and
     * word2 are anagram each other then return true, if not then return false
     * @param word1
     * @param word2
     * @return boolean
     * @see ("listen", "Silent") => true, ("java", "cava") => false
     *
     * */

    // Required! Method name is: isAnagram(String word1, String word2)
    public static boolean isAnagram(String word1, String word2) {
        boolean check = false;
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        int counter = 0;
        int counter1 = 0;
        for (int i = 0; i < word1.length(); i++) {
            counter = 0;
            for (int k = 0; k < word2.length(); k++) {
                if (word1.charAt(i) == word2.charAt(k)) {
                    counter++;
                }
            }
            if (counter == 1) {
                counter1++;
            }
        }
        if (counter1 == word1.length() && counter1 == word2.length()) {
            check = true;
        }
        return true;
    }

    /*
     * The method takes integer of array as an argument and returns second larges number of integer from
     * that array.
     * @param arr
     * @return num
     * @see [3, 6, 1, 8, 9, 9, 10, 10, 10] => 9
     * */

    // Required! Method name is: secondLargestNum(int[] arr)
    public static int secondLargestNum(int[] arr) {
        int max = arr[0];
        int max2 = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            for (int j = 0; j < arr.length; j++)
                if (max2 < arr[j] && arr[j] < max) {
                    max2 = arr[j];
                }
        }
        return max2;
    }





    /*
     * Requirments: See task 4
     * @param db
     * @param op
     * @param id
     * @param data
     * @return database => String
     * @see ("1etsy#2wooden#3spoon","add","4","aaa") => 1etsy#2wooden#3spoon#4aaa
     * */

    // Required! Method name is: lameDb(String db, String op, String id, String data)

}

