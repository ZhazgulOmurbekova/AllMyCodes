package Polymorphism2;

public class Humanscale  extends Chair implements Rollable, Collapsible {

    @Override
    public void sit() {
        System.out.println("Sitting on Humanscal chair ");
    }

    @Override
    public void stepOnIt(){
        System.out.println("Stepping on Humanscal  chair");
    }



    @Override
    public void lock() {
        System.out.println("Humanscale is locking ");
    }

    @Override
    public void unlock() {
        System.out.println("Humanscale is unlocking ");
    }

    @Override
    public void fold() {
        System.out.println("Humanscale is folding ");
    }

    @Override
    public void unfold() {
        System.out.println("Humanscale is unfolding ");
    }



    @Override
    public void rollBack() {
        System.out.println("Humanscale is rolling Back ");
    }

    @Override
    public void rollForward() {
        System.out.println("Humanscale is rolling Forward ");
    }
}
