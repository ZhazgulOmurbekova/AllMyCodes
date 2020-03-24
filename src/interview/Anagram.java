package interview;

public class Anagram {
    public static void main(String[] args) {
        String a = "march";
        String b = "charma";
        boolean check = true;
        if (a.length() != b.length()){
            System.out.println( check = false);

        }


        int count = 0;
        for (int i = 0; i < a.length() ; i++) {

            for (int j = 0; j < b.length() ; j++) {
                if(a.charAt(i) == b.charAt(j)){
                    count++;
                    b = b.replaceFirst(b.charAt(j) + "", "");
                  break;
                }

            }
        }if (count == a.length()){

            System.out.println(check = true);
        }else{
           ;
            System.out.println( check = false);
        }
    }
}
