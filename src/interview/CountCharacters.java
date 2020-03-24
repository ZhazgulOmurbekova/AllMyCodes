package interview;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "helloword";
        while (str.length() != 0 ){
            int count = 0;
            char ch = str.charAt(0);
            for (int i = 0; i < str.length(); i++) {
                if(ch == str.charAt(i)){
                    count++;
                }
            }
            System.out.println(ch + " " + count);
            str = str.replaceAll(ch + "", "");

        }
    }
}
