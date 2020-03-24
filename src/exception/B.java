package exception;

import java.io.IOException;

public class B extends A {

    @Override
    void m()throws Exception{

    }

    @Override
    void m2 ()throws C {
        try {
            super.m2();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
