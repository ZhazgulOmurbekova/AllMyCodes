package methods;

public class ReturnMethodTaskWeekend {

/*Write a method that will tell you if it is the weekday or not. The method takes a
String, Saturday and Sunday are the only weekend days

*/

    public static void main(String[] args) {
        System.out.println(isWeekday("sat"));
    }
    public static boolean isWeekday(String day) {
        day = day.toLowerCase();
        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                return true;
            case "saturday":
            case "sunday":
                return false;

            default:
                System.out.println("Invalid day provided");
                return false;
        }
    }






}
