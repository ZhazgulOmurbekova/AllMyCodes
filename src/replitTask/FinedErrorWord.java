package replitTask;

public class FinedErrorWord {
    public static void main(String[] args) {

    }
    public static boolean isError(String line)
    {
        if (line.contains("error")){
            return true;
        }else{
            return false;
        }
    }
}
