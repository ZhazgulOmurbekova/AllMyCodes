package replitTask;

public class Dublicates {
    public static void main(String[] args) {
        String []name={"1","2","aa","1","2","1", "aa"};
        System.out.println(getDup(name));
    }
    public static int getDup(String[] r)
    {

        int counter=0;
        for (int i=0; i< r.length; i++){
            for (int j=0; j<i; j++){
        if (r[i].equals(r[j])) {
            counter++;
    }
    }
    }
return counter;
    }
}
