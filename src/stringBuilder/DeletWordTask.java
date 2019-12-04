package stringBuilder;

import utilities.MyCollection;

import java.util.ArrayList;

public class DeletWordTask {
    /*Create a method deleteWord. The method will take a String and check if “con”
    is in the String. If it is in the String remove it from the String. Return the String with any changes.
     */
    public static void main(String[] args) {
        System.out.println(deleteWord("I want to concat"));
        System.out.println(deleteWord("abraka dabra", "ra"));

        ArrayList<String> newList = new ArrayList<>();

        newList.add("fghjk");
        newList.add("fghj");

        System.out.println(insertWord(newList));

        ArrayList<String> newList1 = MyCollection.randomArrayList(5);
        System.out.println(newList);
        System.out.println(insertWord(newList,"BYE"));


    }
    public static String deleteWord(String str){
        StringBuilder sb = new StringBuilder(str);

        if (sb.toString().contains("con")){
            int index = str.indexOf("con");
            sb.delete(index, index+3);

        }
          return  sb.toString();
    }
/*Overload the deleteWord method to take two Strings. The first String is the main String and the second String is the
String we are looking for. Before this second String was always “con”, but now it will be more dynamic.
If the String we are looking for is found in the main String, then remove that part. Return the String with any changes.
 */
public static String deleteWord(String word, String target) {
    StringBuilder sb = new StringBuilder(word);
    int index = sb.indexOf(target);
    if(index >= 0) {
        sb.delete(index,index+ target.length());
    }
    return sb.toString();
}
/*Create a method insertWord. The method will take an ArrayList of Strings.
Go through each word of your ArrayList and any element that has an even number of characters will be changed to have
“hello” in the middle of the String. Return the changed ArrayList.

Overload the insertWord method to take two Strings. The first String will be the main String and the second
String will be the word inserted in the middle of all even numbered Strings. Return the changed ArrayList.
*/

public static ArrayList insertWord(ArrayList<String> list){

   // ArrayList<String> words = new ArrayList<>();
    for (int i = 0; i < list.size(); i ++){
        if (list.get(i).length() % 2 == 0){
            StringBuilder sb = new StringBuilder(list.get(i));
           sb.insert(list.get(i).length()/2, "hello");
           list.set(i, sb.toString());

        }
    }
    return list;
}
    public static ArrayList insertWord(ArrayList<String> list, String target){

        // ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < list.size(); i ++){
            if (list.get(i).length() % 2 == 0){
                StringBuilder sb = new StringBuilder(list.get(i));
                sb.insert(list.get(i).length()/2, target);
                list.set(i, sb.toString());

            }
        }
        return list;
    }
//    public static String deleteWord(String mainStr1, String str2){
//        StringBuilder sb1 = new StringBuilder(mainStr1);
//        StringBuilder sb2 = new StringBuilder(str2);
//        if (sb1.toString().contains(sb2.toString())){
//            int index = sb1.indexOf(sb2.toString());
//            sb1.delete(index, index + sb2.length());
//
//        }
//        return sb1.toString();
//    }
}
