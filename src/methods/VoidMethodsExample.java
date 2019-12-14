package methods;

public class VoidMethodsExample {
    public static void main(String[] args) {
        seyHi();

        seyHi();
        //sayBye();
    }
    public static void seyHi() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");

        }
        sayBye();
    }

public static void sayBye(){
        System.out.println("Bye");
    }

}