package Polymorphism2;

public class IdeaShopping {
    public static void main(String[] args) {
        Chair c = new Aeron();
        c.sit();


        Collapsible co = new Humanscale();
        co.unfold();
       Rollable r = new Humanscale();
        r.rollBack();
       Rollable r2 = new Aeron();


        Chair h = new Humanscale();



    }
}
