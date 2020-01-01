package methodOverriding;

public class SavingAccount extends BankAccountPublic{
    double interestIncome;
    public void transfer(double fee){
        this.balance = this.balance-fee;
        this.balance -= (fee * 0.2);


    }

    public void info(){
       super.info();
        System.out.println("interest Income " + interestIncome);
    }

    public void calculateAnnualInterestIncome(){

        interestIncome += this.balance * 0.3;
    }


}
