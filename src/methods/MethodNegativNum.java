package methods;

import com.sun.tools.classfile.ConstantPool;

public class MethodNegativNum {
    public static void main(String[] args) {
        /* creat a method that will print negative numbers from a given int array */
int [] arr2 = {-1, 3, -4, -2, 32, 2, -22, 1};
        negatNum(arr2);
    }

    public static void negatNum(int [] arr) {
    for  (int num:arr ){
        if (num <0){
            System.out.println(num);
        }
    }

    }
}
