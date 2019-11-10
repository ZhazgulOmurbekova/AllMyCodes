package methods;

public class ReturnMethodExample {
    public static int getThree() {
        return 3;

    }

    public static String  getDate() {
        String date="11/3/2019";
        return date.replace("/",".");

    }
    public static void main(String[] args) {
       int a= getThree()+7;
       String b =getDate()+ " date";
        System.out.println(a);
        System.out.println(getDate());
        System.out.println(b);

        String date = getDate();
        System.out.println(date);

    }
}
