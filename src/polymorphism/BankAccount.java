package polymorphism;

public class BankAccount extends PaymentMethod {


    @Override
    public void charge(double amount) {
        System.out.println("Amount charging in Bank account " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Amount refunding  in Bank account " + amount);
    }
}
