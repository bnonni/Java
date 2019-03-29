/*
write a client class to test BankAccount
*/
public class TestBankAccount {
 public static void main(String[] arg) {
 try {
   BankAccount john = new BankAccount();
   
   john.setAccount_no("abc12345");
   System.out.println("1. john's account is " + john.getAccount_no());
   john.setAccount_balance(10);
   System.out.println("2. john's balance is $" + john.getAccount_balance());
   System.out.println("3. john's charge is $" + john.computeCharge());

   String myAccount = "12345";
   double myBalance = 50.00;
   BankAccount kim = new BankAccount(myAccount, myBalance);;
   System.out.println("4. kim's account is " + kim.getAccount_no());
   System.out.println("5. kim's balance is $" + kim.getAccount_balance());
   kim.deposit(40.00);
   System.out.println("6. kim's balance is $" + kim.getAccount_balance());
   System.out.println("7. kim has " + kim.toString());
   System.out.println("8. kim has " + kim);

   BankAccount jay = new BankAccount("100200", 70);
   System.out.println("9. jay's account is " + jay.getAccount_no());
   jay.setAccount_balance(-100);
   jay.setAccount_balance(10);
   System.out.println("10. jay's balance is $" + jay.getAccount_balance()); 
   jay.deposit(-40);
   jay.deposit(20);
   System.out.println("11. jay's balance is $" + jay.getAccount_balance()); 

} catch (IllegalArgumentException e) {
      System.out.println("The program has been aborted due to bad data: " + e);
      System.out.println("Call GSU computer science dept. for assistance.");
  } 
 }
}
