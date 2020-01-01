package Polymorphism2;

public class Aeron extends Chair implements Rollable {
    @Override
    public void sit() {
        System.out.println("Sitting on Aeron chair ");
    }

    @Override
    public void stepOnIt() {
        System.out.println("Stepping on Aeron chair");

    }




    @Override
    public void rollBack() {
        System.out.println("Aeron is rolling back");
    }

    @Override
    public void rollForward() {
        System.out.println("Aeron is rolling forward");
    }
}
