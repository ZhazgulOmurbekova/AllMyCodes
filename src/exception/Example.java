package exception;

public class Example {
    public static void main(String[] args) {
        try {
            String s = "hello";
            System.out.println(s.charAt(30));
            System.out.println(3/0);

            System.out.println(new int [] {3,21,1,} [5]);
        }catch (StringIndexOutOfBoundsException e){
            System.err.println("Index does not exist ");
            System.out.println(e.toString());
        }catch (ArithmeticException e ){
            System.err.println("invalid math");
            System.out.println(e.toString());
        }catch (Exception e){
            System.out.println("Unknown exception");
            System.out.println(e.toString());
        }

//        try{
//            Thread.sleep();
//        }catch ()
    }
}
