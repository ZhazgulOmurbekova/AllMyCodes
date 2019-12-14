package methods;

public class OverloadingMethodExample {
    public static void main(String[] args) {
        jump();
        jump("nike");
        jump(6);
        jump(5);
        String [] arr ={"d"};
        jump(arr);
        System.out.println(jump(arr));
    }
    public static void jump () {
        System.out.println("You don't get far ");
    }

    public static void jump (String shoes) {
        System.out.println("The shoes go farther");
    }

    public static void jump (int distace ) {
        System.out.println("you jumped "+ distace);
    }

    public static String jump (String []arr ) {
        return "jumped by array";
    }
//    public static void jump (int h) {
//        return "jumped by array";
//    }
}
