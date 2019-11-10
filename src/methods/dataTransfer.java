package methods;

public class dataTransfer {
    public static void main(String[] args) {
        printName("james");
        printName("adam");
        firstCharacter("jazgul");

    }
    public static void  printName(String name ){
        //String name1 ="James";
        System.out.println(name);
    }
    public static void  firstCharacter(String name){
        System.out.println(name.charAt(0));

    }
}
