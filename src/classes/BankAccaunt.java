package classes;
/*2. Create a class BankAccount
Instance variables: type, accountNumber, balance,
holderName Methods:

deposit. Method accepts double and it doesn’t return anything. Method should simply print
“%double is deposited to your account” and add given double to the balance.

transfer -> accepts double -> Method should print “%double $ is transferred from your account” and
 decrement balance by given amount.

info -> Method doesn’t accept or return anything. It should simply print the information about the BankAccount as below format
Name: %holderName
Balace: %balance
Type: %type
Account Number: %accountNumber*/

public class BankAccaunt {

    String holderNAme;
  String type;
  int accountNum;
  double balance;

  public void deposit(double num){
      System.out.println(num+ "is deposited to your account ");
      num+=balance;
  }public void  transfer (double amount ){
      if (this.balance>=amount){
        System.out.println(amount+ " $ is transferred from your account ");

        balance-= amount;
    }else {
          System.out.println("failed");
      }
  }
    public void info(){
        System.out.println("Name: "+ this.holderNAme);
        System.out.println("balance:" +this.balance);
        System.out.println("Type: "+ this.type);
        System.out.println("account number "+ this.accountNum);
    }




}
