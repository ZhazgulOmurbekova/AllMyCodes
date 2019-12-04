package utilities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * This method creates list of String from user
 *
 *
 *
 */

public class MyCollection {
    /*Create a package utilities Create a class MyCollection
    Create a static method called getStringListThis method will
     keep asking used to enter Strings until they are done. Take all the Strings they give and put them into an
ArrayList. Return the ArrayList after the user has entered all the information they wanted.Flow:Please enter your String:>
 Chair Do you want to enter more? Y/N> YPlease enter your String:>
HatDo you want to enter more? Y/N> N—> Returns ArrayList including: Chair and Hat
     */
    public static void main(String[] args) {
    }



    public static ArrayList getStringListThis(){
        Scanner input = new Scanner(System.in);
        ArrayList<String > words= new ArrayList<>();


        while (true){
            System.out.println("Enter word");
            words.add(input.nextLine());
            System.out.println("Are you done?  Y/N");
            if (input.nextLine().equals("Y")){
                break;
            }
        }return words;
//        String answer="";
//        String str = "";
//        do {
//            System.out.println("pleas Enter your str");
//            str= input.nextLine();
//            words.add(str);
//            System.out.println("Do you want to enter more? ");
//            answer = input.nextLine();
//
//        }
//        while (answer.equalsIgnoreCase("yes")) ;
//
//        return words;
    }


    public static ArrayList getIntList(){
        /*Create a static method getIntegerList. This method does the same as getStringList,
        but it accept numbers instead of Strings from the user
         */
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> a= new ArrayList<>();
        String  answer="";
        int  in = 0;
        do {
            System.out.println("pleas Enter your str");
            in= input.nextInt();
            input.nextLine();
            a.add(in);
            System.out.println("Do you want to enter more? ");
            answer = input.nextLine();
            input.nextLine();
        }
        while (answer.equalsIgnoreCase("yes")) ;

        return a;
    }




    public static ArrayList<String> filterList(ArrayList<String > words , int size ){
        /*Create a static method filterList. This method accepts a String array list and a number.
         The method will go through each element from the array list and create a new array
        list with Strings that have the same length as the number given in the parameters
         */
        ArrayList<String> newWords= new ArrayList<>();
        for ( String s : words){
          if(s.length() == size) {
              newWords.add(s);
          }
        }
        return newWords;
       }




       public static ArrayList removeDublicat(ArrayList<String > words){
        /*Create a static method removeDuplicates.This method accepts a String array
         list and removes any duplicate elements.
         The method will return an array list with only unique values
         */
        ArrayList<String> newWords = new ArrayList<>();

        for (String s : words){
            if (newWords.contains(s)){
                continue;
            }
            newWords.add(s);
        }
        return newWords;



//        for (int i =0; i < words.size(); i++ ){
//            int count=0;
//            for (int k=0; k < words.size(); k++){
//                if (words.get(i).equals(words.get(k))){
//                    count++;
//                    if (count<2){
//                        newString.add(words.get(i));
//                    }
//                }
//            }
//        }
//        return newString;
    }

    public static ArrayList<String> randomArrayList(int elements) {
        ArrayList <String> words = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i < elements; i++) {
            int size = random.nextInt(10) + 1;
            String temp = "";
            for(int j= 0; j < size; j++) {
                int characters = random.nextInt(23) + 65;
                temp += (char)characters;
            }
            words.add(temp.toLowerCase());
        }
        return words;
    }
    }

