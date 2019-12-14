package project;

import java.util.Arrays;

public class Anagram1 {
    public static void main(String[] args) {
        String[]array={"listen","book","linest","adf","enilst"};
        String word="silent";
        int count=0;
        int finalcount=0;
        int finalcountlast=0;
        String keeper="";
        for(int k=0;k<array.length;k++){
            if(array[k].trim().length()==word.length()){
                for(int i=0;i<array[k].length();i++){
                    count=0;
                    for(int j=0;j<word.length();j++){
                        if(array[k].charAt(i)==word.charAt(j)){
                            count++;
                        }
                    }
                    if(count==1){
                        finalcount++;
                    }
                }
                if(finalcount==array[k].length()&&finalcount==word.length()){
                }
                keeper+=array[k]+" ";
                finalcountlast++;
                for(int m=0;m<finalcount;m++){
                }
            }}
        String[]anagram=new String[finalcountlast];
        anagram=keeper.trim().split(" ");
        System.out.println(Arrays.toString(anagram));
    }}

