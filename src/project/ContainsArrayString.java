package project;

public class ContainsArrayString {

    static String[] words;
    public static void main(String[] args) {



    }
    public boolean contains(String word) {
        /**
         *
         * @param word:
         *            input word
         * @return true if the given word exists in the words array. False otherwise
         */
        // TODO
       for (int i=0; i<words.length; i++){
           if (words[i].contains(word)){
               return true;
           }
       }
        return false;
    }/**
     *
     * extra credit
     * @param array: integer of array
     * @return return array of sorted integer
     * DO NOT USE ARRAYS.SORT
     */
    public int[] sort(int[] array){

           for (int j=0; j<array.length;j++){
               int [] sort=new int[array.length];
               if (array[j]<array[j]){
                   sort[j]= array[j];

                return sort;

           }
       }

        return null;
    }	/**
     *
     * @param word:
     *            input word
     * @return the number of occurrences of the words array . If the word does not
     *         exist, return 0
     */
    public int count(String word) {

        // TODO
        int counter=0;
        for (int i=0; i<words.length; i++){
            if (words[i].equalsIgnoreCase(word)){
                counter++;

            }if(word.length()==0){
                return 0;
            }
        }

        return counter;

    }
}



























