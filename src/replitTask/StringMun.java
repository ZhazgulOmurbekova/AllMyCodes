package replitTask;

public class StringMun {
    public static String at3(String target,String word)
    {
        String ch1="";
        String ch2="";
        if (target.length()> word.length()){
            ch1= target.substring(0,3);
            ch2=target.substring(3);

        }
        return ch1+word+ch2;
    }
}
