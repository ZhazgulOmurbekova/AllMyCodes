package replitTask;

import java.util.ArrayList;

public class SearchList {
    public static String search(ArrayList<String> r, String find) {
        String a="";
        for (int i = 0; i < r.size(); i++){
            if(r.get(i).contains(find)){

                return a;

            }else {

                return a;
            }
        }return a;
    }//end wineSeller

    public static void main(String[] args)
    {

        ArrayList<String>  arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr,"foo");
        System.out.print(find_tst);//foo bar


    }
}
