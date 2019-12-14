package enumEx;

public class EnumTask {
    /*Make an Enum for all the days in a week. Then write a method that will accept what day it is and print some message.
If it is Monday print “Mondays are bad”
If it is Friday print “Fridays are great”
If it is Saturday or Sunday print “Weekends are the best”
If it is any other day print “Regular day”*/
    //Connection connection;
    public static void main(String[] args) {
        getGays(DaysInTheWeek.FRIDAY);
    }
    public static void getGays(DaysInTheWeek days){
        switch (days){
            case MONDAY:
                System.out.println("“Mondays are bad”");
                break;
            case FRIDAY:
                System.out.println("Fridays are great");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are the best");
                break;
            default:
                System.out.println("Regular day");

        }

    }
    /*Make a better calculator method. Create an enum for all the operators (+,-,*,/,%)
Then create a method that will accept two double numbers and an Operator.
Return the result of the operation
-> Special case: Before you divide, make sure the second number is not 0, if it is 0 then print “
 you cannot divide by 0 and return 0. If the second number is not 0 then do the operation as usual.
     */

    public static void  calculator(DaysInTheWeek cal){
        switch (cal){
            case MONDAY:
                System.out.println("“Mondays are bad”");
            case FRIDAY:
                System.out.println("Fridays are great");
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are the best");
            default:
                System.out.println("Regular day");

        }

    }
}
