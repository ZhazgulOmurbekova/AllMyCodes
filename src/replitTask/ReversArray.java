package replitTask;

public class ReversArray {
    public static void main(String[] args) {
       int []num = {1,2,42,1,3};
        System.out.println(do_switch(num));
    }
    public static int[] do_switch(int[] i) {
        for (int j = 0; j < i.length / 2; j++) {
            int temp = i[j];
            i[j] = i[i.length - j - 1];
            i[i.length - j - 1] = temp;
        }
        return i;
    }

}

