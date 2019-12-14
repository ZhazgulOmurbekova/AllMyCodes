package project;

public class ReversSentenc {
    public String reverseSentence(String sentence) {

        // TODO
        String reversed = "";
        String []arr=sentence.split(" ");
        String last="";

        for (int i = arr.length - 1; i >= 0; i--) {
            last += arr[i] + " ";

        }
        for (int j =last.length(); j>0; j--){
        }System.out.println(last.substring(0, last.length() - 1));




        return null;
    }
}
