//testing the creation of a new BankAccount() obj
public class TestBankAccount{
 public static void main(String[] args){
  
  BankAccount obj1 = new BankAccount();
  
  obj1.setAccount_no("80690-bwn");
  
  obj1.setAccount_balance(1000.00);
  
  System.out.println("obj1's account no is " + obj1.getAccount_no() + "\nobj1's account balance is " + obj1.getAccount_balance());
  
 }
}