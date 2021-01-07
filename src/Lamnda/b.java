package Lamnda;

public class b {
    public static void main(String[] args) {

        System.out.println(methodOne(11));

    }


    static  int methodOne(int i){
        return methodTwo( i *=11);
    }

    static  int methodTwo(int i){
        return methodTree( i /=11);
    }
    static  int methodTree(int i){
        return methodFour( i -=11);
    }

    static  int methodFour(int i){
        return i +=11;
    }
}
