/*
project 7
*/
public class Ch8_BankAccount {
 private String account_no;
 private double account_balance;
 public Ch8_BankAccount(){
   account_no = "";
   account_balance = 0.0;
 }
 public Ch8_BankAccount(String account_no, double account_balance)
 {
   this.account_no = account_no;
   this.account_balance = account_balance;
 }
 public String getAccount_no() {
   return account_no;
 }
 public double getAccount_balance(){
   return account_balance;
 }  
 public void setAccount_no(String account_no){
   if(account_no.equals("")){
      throw new IllegalArgumentException();
   }
   this.account_no = account_no;
 }
 public void setAccount_balance(double account_balance){
   if(account_balance < 0){
      throw new IllegalArgumentException();
   }
   this.account_balance = account_balance;
 }
 public void deposit(double p_deposit){
   if(p_deposit < 0) {
      throw new IllegalArgumentException();
   }
   account_balance += p_deposit;
 }
 public double computeCharge(){
   if(this.account_balance < 50){
    return 10;
   } else {
    return 0;
   }
 }
 public String toString(){
   String stat1 = "account_no=" +account_no;
   String stat2 = "account_balance=" + account_balance;
   return stat1 + "," + stat2;
 }
}