package methods;

public class OverloadMethodNurgazyExample {
    public static void main(String[] args) {

        printString("apple", "banana"); //applebanana
        // printString(54); //5
        printString(2, 6);// 16
        printString("ksdhf", "isdhf");
    }

    public static void printString(String str, String str2) {
        System.out.println(str + str2);

    }

    public static void printString(int index) {
        System.out.println(index);

    }

    public static int printString(int a, int b) {
        return a * b;
    }
}

