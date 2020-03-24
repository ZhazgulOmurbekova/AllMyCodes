package arrayss;

public class ArrayValueOfMultpWord {
    public static void main(String[] args) {
        /*9) Given a String of: "knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can”, “fridge”, “dish washer”
Go through the array and print the value if there is multiple words. */
        String[]words1={ "knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can",  "fridge", "dish washer" };

        for (int i =0; i < words1.length; i++){
            if (words1[1].trim().contains(" ")){
                System.out.println(words1[i]);
            }

        }
    }
}
