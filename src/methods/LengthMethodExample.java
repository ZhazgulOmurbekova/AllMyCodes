package methods;

public class LengthMethodExample {
    public static void main(String[] args) {
        String word ="word";
        System.out.println(word.length());
        System.out.println(stirngLength("word"));
    }
    public static int stirngLength(String str){
        int count =0;
        for (int i=0; i<str.length(); i++){

            count++;

        }
        return count;
}
}
