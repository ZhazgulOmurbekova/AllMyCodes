package methods;

public class OverleadMethodParametersProm {
    public static void main(String[] args) {
//        double  a =45;
        calc(45);
    }

    public static void calc(int i) {
        System.out.println(" using int ");

    }

    public static void calc(long d) {
        System.out.println("using long ");

    }

    public static void calc(float f) {
        System.out.println(" using float ");
// always printing   int if there is no int print closest
    }

    public static void calc(byte d) {
        System.out.println(" using double  ");

    }

//    public static int calc(byte d) {
//        System.out.println(" using double  ");
//    }
}