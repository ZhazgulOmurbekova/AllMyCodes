package polymorphism;

import java.util.ArrayList;

public class VerifyTransaction {
    public static void main(String[] args) {
        MobilVerifiable m1 = new ZelleTransfer();
        MobilVerifiable m2 = new CreditCard();


        ArrayList<MobilVerifiable> transactions = new ArrayList<>();
        transactions.add(m1);
        transactions.add(m2);
        for(MobilVerifiable m : transactions){
            if(m.verify()){
                System.out.println("transaction Success! ");
            }else{
                System.out.println("transaction failed");
            }
        }
    }
}
