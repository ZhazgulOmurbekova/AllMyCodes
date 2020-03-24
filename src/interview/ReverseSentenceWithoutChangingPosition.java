package interview;

import java.util.Arrays;

public class ReverseSentenceWithoutChangingPosition {
    public static void main(String[] args) {

        String [] arrs = {"java", "is", "fun"};
        System.out.println(reverseString(arrs));
    }
    public static String reverseString(String[]arrs)
    {
        String[] t=new String[arrs.length];

        for(int i=0;i<arrs.length;i++)
        {
            for(int j=arrs[i].length()-1;j>0;j--)
            {
               t[i]+=arrs[i].substring(j,j+1);
            }
           // t[i]
        }
        return Arrays.toString(t);
    }

}
