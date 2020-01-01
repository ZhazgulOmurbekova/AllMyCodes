package polymorphism;

public class PaymentMethod implements MobilVerifiable{

    public void charge(double amount){
        System.out.println("Amount charge: " + amount);
    }
    public  void refund (double amount){
        System.out.println("Amount refunded: " + amount);
    }
@Override
    public boolean verify (){
        return true;
    }
}
