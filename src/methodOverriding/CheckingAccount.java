package methodOverriding;

import classes.BankAccaunt;

public class CheckingAccount extends BankAccountPublic {
    @Override
    public void transfer(double fee){
       double total = fee + (fee * 0.005);
        if (balance >= total){
            System.out.println("transfer");
            this.balance -= total;
        }else{
            System.out.println("Don't transfer ");
        }

    }

}
