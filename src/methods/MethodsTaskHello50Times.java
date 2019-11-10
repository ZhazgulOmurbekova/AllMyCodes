package methods;

public class MethodsTaskHello50Times {
    public static void main(String[] args) {
        hello();
        odd();
    }
/*Create a method that prints “Hello” 50 times */

    public static void hello(){
        for (int i=0; i<50; i++){
            System.out.println("hello"+i+1);
        }
    }
    /*Create a method that print odd numbers up to 100.*/
    public static void odd(){
        for (int i=0; i<=100; i++){
            if (i %2==1){
                System.out.println(i);
            }
        }
    }

}
