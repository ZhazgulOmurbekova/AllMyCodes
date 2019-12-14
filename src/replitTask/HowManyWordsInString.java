package replitTask;

public class HowManyWordsInString {
    public static void main(String[] args) {
        System.out.println(wordCount("bla bla bla"));

//            String str = "geekss@for@geekss";
//            String[] arrOfStr = str.split("@", 2);
//
//            for (String a : arrOfStr)
//                System.out.println(a);
        }

    public static int wordCount(String words) {
        int count=0;
        String[] arr = words.split(" ");
        for (int i =0; i < arr.length; i++){



                count++;


        } return count;

    }}

