package staticClass;


import java.util.Arrays;

import static java.util.Arrays.*;

public class ImportingStatic {
    public static void main(String[] args) {

        int [] a = {3, 4, 2, 5};

        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
