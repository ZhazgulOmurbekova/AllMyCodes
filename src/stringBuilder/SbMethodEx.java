package stringBuilder;

public class SbMethodEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Car");

       sb.reverse();
        System.out.println(sb);
       sb.delete(0,2);
        System.out.println(sb);
       sb.insert(0, "hello");
        System.out.println(sb);
    }
}
