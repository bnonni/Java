// author: Bryan Nonni
// date: 09-17-2018
// class: CSC 1302 - Programming Java
// assignment: project 7, ch 8

// BankAccount class with 2 states - account_no & account_balance
public class BankAccount{
 private String account_no;
 private double account_balance;
 
//1 default constructor
 public BankAccount(){
  this.account_no = "";
  this.account_balance = 0.0;
 }
 
//1 constructor with given account_no and account_balance 
 public BankAccount(String account_no, double account_balance){
  this.account_no = account_no;
  this.account_balance = account_balance;
 }

//2 getters and 2 setters enforcing class invariant  
//setter1
 public void setAccount_no(String account_no){
  if(account_no.equals("")){
   throw new IllegalArgumentException();
  }
  this.account_no = account_no;
 }
 //setter2
 public void setAccount_balance(double account_balance){
  if(account_balance < 0){
   throw new IllegalArgumentException();
  }
  this.account_balance = account_balance;
 }
 //getter1
 public String getAccount_no(){
  if(account_no.equals("")){
   throw new IllegalArgumentException();
  }
  return account_no;
 }
 //getter2
 public double getAccount_balance(){
  if(account_balance < 0){
   throw new IllegalArgumentException();
  }
  return account_balance;
 }

 //1 deposit method, enforcing class invariant, that accepts parameter (p_deposit)
 //add it to account_balance
 //do not return a value
 public void deposit(double p_deposit){
  if(p_deposit < 0){
   throw new IllegalArgumentException();
  }
  account_balance += p_deposit;
 }

 // 	1 computeCharge method, accepts no parameters, that return $10 if account_balance < $50, otherwise $0.
 public double computeCharge(){
  if(this.account_balance < 50.00){
   return 10.00;
  }else{
   return 0.00;
  } 
 }

 //1 toString method
 public String toString(){
  String state1 = "account_no = " + account_no; 
  String state2 = "balance = " + account_balance; 
  return state1 + "," + state2;
 }
}