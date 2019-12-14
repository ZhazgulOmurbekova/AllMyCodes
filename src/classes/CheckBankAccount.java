package classes;

public class CheckBankAccount {
    public static void main(String[] args) {
        BankAccaunt myBank= new BankAccaunt();
        myBank.holderNAme="Bank of America";
        myBank.accountNum=34556;
        myBank.type="Business";
        myBank.balance=1233;

        myBank.info();
        myBank.deposit(900);
        System.out.println();

        myBank.info();
        myBank.transfer(700);
        System.out.println();

        myBank.info();
    }
}
