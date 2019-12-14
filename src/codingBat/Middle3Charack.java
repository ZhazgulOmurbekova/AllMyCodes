package codingBat;

import com.sun.org.apache.xerces.internal.impl.dv.dtd.XML11IDDatatypeValidator;

public class Middle3Charack {
    public static void main(String[] args) {

    }
    public String middleThree(String str) {


       int  mid =0;
       int mid2=0;


        if (str.length()%2==1){
            mid=str.length()/2-1;
            mid2=str.length()/2+1;
            String name1= str.substring(mid);
            String name2=str.substring(mid2);
            String name3= name1+name2;
            return name3;
            }
       return str;
    }

}
