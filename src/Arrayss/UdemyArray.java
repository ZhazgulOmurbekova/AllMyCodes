package Arrayss;

public class UdemyArray {
    public static void main(String[] args) {
        int[] intArr = new int[10];
        intArr[0] = 45;
        intArr[1] = 865;
        intArr[2] = 23;
        intArr[3] = 6;
        intArr[4] = 368;
        intArr[5] = 9032;
        intArr[6] = 557;
        intArr[7] = 226;
        intArr[8] = 834564;
        intArr[9] = 34001;

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
        int[] inttArr = new int[20];

        for (int i = 0; i < inttArr.length; i++) {
            inttArr[i] = i + 1;
        }

        for (int i = inttArr.length - 1; i >= 0; i--) {
            System.out.println(inttArr[i]);
        }

    }
}
