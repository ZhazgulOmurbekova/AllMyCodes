package interview;

public class MergeTwoStrings {
    public static void main(String[] args) {
        String name1 = "Jazgul";
        String name2 = "123423";
        String merge = "";
        int length = 0;
       if(name1.length() > name2.length()){
           length = name1.length();
       }else {
           length = name2.length();
       }
        for (int i = 0; i < length; i++) {
            if(i < name1.length()){
                merge += name1.charAt(i);
            }if(i < name2.length()){
                merge += name2.charAt(i);
            }
        }
        System.out.println(merge);
    }
}
