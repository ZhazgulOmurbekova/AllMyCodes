package nurlansTask;

public class Task4 {
    public static void main(String[] args) {

        String word="Cybertek";
        String firstThree=word.substring(0,3);
        String lastThree=word.substring(5);

        System.out.println(firstThree);
        System.out.println(lastThree);

        String half = word.substring(0,word.length()/2);
        System.out.println(half);

        String firstLater=word.substring(0,1);
        String lastLater=word.substring(7);
        System.out.println(firstLater);
        System.out.println(lastLater);

        String word2= "Hello word";
        int numOfWord= word2.length();
        System.out.println(numOfWord);


    }
}
