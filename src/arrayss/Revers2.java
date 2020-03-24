package arrayss;

public class Revers2 {
    public static void main(String[] args) {
        String  str = "we went to picnic today";
        String [] arr = str.split(" ");
        String rev= "";
        for (String word: arr){
          for (int i = word.length()-1; i >=0; i--){
              System.out.print(word.charAt(i)+" ");
          }
            System.out.print("          ");
        }
       // System.out.println();
    }
}
