package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class SchoolAccountDepartment {

    public static void main(String[] args) {
        PaymentMethod pm1 = new BankAccount();
        PaymentMethod pm2 = new PayPal();
        PaymentMethod pm3 = new CreditCard();
        PaymentMethod pm4 = new PayPal();
        PaymentMethod pm5 = new BankAccount();

        ArrayList <PaymentMethod> stPm = new ArrayList<>();

        stPm.add(pm1);
        stPm.add(pm2);
        stPm.add(pm3);
        stPm.add(pm4);
        stPm.add(pm5);
      for (PaymentMethod p : stPm){
          p.charge(500);
      }


    }
}
