package replitTask;

public class ReversString {
    public static String reverse(String input)
    {
        String last="";
        for (int i =input.length()-1;i<0; i--){
         last+=input.charAt(i)+" ";
    }
        return last;
}
}
