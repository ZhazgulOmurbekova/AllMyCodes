package mockInterview;

public class ReplaceComonCharIntStr2 {
    public static void main(String[] args) {
        removeChar("javap", "apple");
    }

    public static void removeChar(String str1, String str2){



       for (int i = 0; i < str1.length(); i++) {
                if (str2.contains(str1.charAt(i)+"")) {
                    str2= str2.replaceAll(str1.charAt(i) + "", "");
                    str1 = str1.replaceAll(str1.charAt(i) + "", "");
                    i--;

                }



            }



        System.out.println(str1 + str2);
}
}