package mockInterview;

public class ReplaceComonCharInString {
    public static void main(String[] args) {
        removeChar("javaepp", "applepp");
    }

    public static void removeChar(String str1, String str2){

        String sameLetter = "";
        String twoString = str1 + str2;
        String string = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i) == str2.charAt(j)){
                    sameLetter += str1.charAt(i) + "";
                }
            }
        }
        for (int i = 0; i < twoString.length(); i++) {
            if (!sameLetter.contains(twoString.charAt(i) + "")){
                string += twoString.charAt(i)+"";

            }

        }
        System.out.println(string);

//        System.out.println(sameLetter);
//        System.out.println( str1.replaceAll( sameLetter, "") + str2.replaceAll(sameLetter, ""));

    }
}
