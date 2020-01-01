package polymorphismCasting;

public class Park {
    public static void main(String[] args) {
        Animal joe = new GermanShepherd();

        Dog joe2 = (Dog)joe;
        GermanShepherd joe3 = (GermanShepherd) joe2;
        //Trainable joe4 = new (Trainable)joe2;
    }
}
