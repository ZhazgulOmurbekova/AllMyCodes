package switchStatement;

public class StringExSwitch {
    public static void main(String[] args) {
         String fruit = "banana ";
         switch (fruit){
             case "oranges":
                 System.out.println("Orange are sweet");
                 break;
             case "banana":
             case "apple":
                 System.out.println("my favorite");
                 break;
             default :
                 System.out.println("Not a fruit");
         }
    }
}
