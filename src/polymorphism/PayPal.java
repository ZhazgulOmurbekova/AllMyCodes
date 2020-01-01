package polymorphism;

public class PayPal extends PaymentMethod {
    @Override
    public void charge(double amount) {
        System.out.println("Amount charging in PayPal " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Amount refunding  in Paypal " + amount);
    }
}
