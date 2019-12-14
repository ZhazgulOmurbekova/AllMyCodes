package utilities;

public class Mouse {
    String color;
    int size;
    boolean condition ;
    // boolean
    public Mouse(String color, int size, boolean condition, String name){
        this.color = color;
        this.size = size;
        this.condition = condition;
        System.out.println(size +" "+ color + " " + condition + " " + name);
    }public Mouse(){

    }
    public static void main(String[] args) {
       Mouse m1 = new Mouse();
        Mouse m2 = new Mouse();

        m1.color = "blue";
        m2.color ="b";
        System.out.println(m2.color);

        m2 = m1;

       Mouse m3 = m2;

        System.out.println(m2.color);
        System.out.println(m1.color);
        System.out.println(m3.color);
        System.out.println(m1);
        m2.color = "black";
        System.out.println(m2.color);
        System.out.println(m1.color);
        System.out.println(m3.color);

        Mouse m4 = new Mouse("color", 23, true, "Jason");
        System.out.println();

    }

}
