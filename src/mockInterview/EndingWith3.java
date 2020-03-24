package mockInterview;

public class EndingWith3 {
    public static void main(String[] args) {
        int num = 30;
        String a = "";
        for (int i = 0; i < num; i++) {
            if (i % 10 == 3){
              a += i +" ";
            }

        }  System.out.println(a);
    }
}
