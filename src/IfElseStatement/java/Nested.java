package IfElseStatement.java;

public class Nested {
    public static void main(String[] args) {
//        int num = 30;
//
//        if (num>= 0 && num <=50){
//            if ( num>= 10 && num <40){
//                if (num>= 20 && num <= 30){
//
//                }
//            }
//            System.out.println("it is in the range ");
//        }
//        else {
//            System.out.println("not in the range ");
//       int number = 30;

        int number = 67;
        if(number >= 0 && number <= 50) {
            if(number >= 10 && number <= 40) {
                if(number >= 20 && number <= 30) {
                    System.out.println("Your number is good");
                } else {
                    System.out.println("Not in the 20 - 30 range");
                }
            } else {
                System.out.println("Not in the 10 - 40 range");
            }
        } else {
            System.out.println("Not in the 0 - 50 range");
        }
    }
}




