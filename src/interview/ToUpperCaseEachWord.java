package interview;

public class ToUpperCaseEachWord {

    public static void main(String[] args) {
        String a = "happy birthday jazgul";
        String f ="";
        String [] b = a.split(" ");
        for (int i = 0; i < b.length; i++) {
          f +=  " "+b[i].substring(0,1).toUpperCase()  + b[i].substring(1);

        }
        System.out.println(f.trim());
    }
}
