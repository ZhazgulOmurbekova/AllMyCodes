package strings;

import java.util.Scanner;

public class Task50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str= input.nextLine();

        /*Given a String, str , perform the following conditional actions:

Check if str has 3 or more character, if less than 3 or bigger than 100 character, print only Invalid enter
Convert str to all lower characters
If number of character is odd convert middle character Upper case
If number of character is even convert middle two character Upper case (ex: name -> nAMe)*/
int index = str.length()/2;
        if (str.length()<3 && str.length()>100){
            System.out.println("Invalid Enter");
        }
        else if (str.length()%2==1){
            System.out.println(str.substring(0,index)+str.substring(index,index+1).toUpperCase()+str.substring(index+1));
        }
        else if (str.length()%2==0){
            System.out.println(str.substring(0,index-1)+str.substring(index-1,index+1).toUpperCase()+str.substring(index+1));
        }
        System.out.println();


        }
    }

