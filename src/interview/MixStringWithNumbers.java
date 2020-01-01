package interview;

public class MixStringWithNumbers {
    public static void main(String[] args) {
        String name1 = "Jazgul";
        String merge = "";

        for (int i = 0; i < name1.length(); i++) {
            merge += name1.charAt(i);
            merge += (i+1);
        }
        System.out.println(merge);
    }
}
