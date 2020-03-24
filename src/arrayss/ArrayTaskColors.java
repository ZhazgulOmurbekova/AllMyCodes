package arrayss;

public class ArrayTaskColors {
    public static void main(String[] args) {
        /*Create String array for the colors.
Initialize 4 colors.
Loop through each element using for loop and print each color names.*/

       // String []names =new String[3];
        String [] colors={"blue", "red", "brown", "green"};

        for (int i =0; i <colors.length; i++){
            String color=colors[i];

            if (colors[i].length()>=3){



            System.out.println(color+" ");
        }}
    }
}
