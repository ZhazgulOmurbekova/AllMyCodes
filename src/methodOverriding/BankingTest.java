package methodOverriding;

public class BankingTest {
    public static void main(String[] args) {
        BankAccountPublic ba = new BankAccountPublic();
        ba.balance = 300;
        ba.name = "jane";
        ba.accountNumber = 234567654;
        System.out.println(ba);

        String a = "cybertek";

    }


}
