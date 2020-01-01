package polymorphism;

public class CreditCard extends PaymentMethod{

    @Override
    public void charge(double amount) {
        System.out.println("Amount charging in Credit card " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Amount refunding  in Credit card " + amount);
    }
}
