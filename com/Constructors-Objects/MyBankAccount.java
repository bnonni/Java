/*
project 7
*/
public class MyBankAccount {
  private String account_no;
  private double account_balance;

  public MyBankAccount() {
    account_no = "";
    account_balance = 0.0;
  }

  public MyBankAccount(String account_no, double account_balance) {
    this.account_no = account_no;
    this.account_balance = account_balance;
  }

  public String getAccount_no() {
    return account_no;
  }

  public double getAccount_balance() {
    return account_balance;
  }

  public void setAccount_no(String account_no) {
    if (account_no.equals("")) {
      throw new IllegalArgumentException();
    }
    this.account_no = account_no;
  }

  public void setAccount_balance(double account_balance) {
    if (account_balance < 0) {
      account_balance *= -1;
      this.account_balance = account_balance;
      System.out.println("You've entered a negative number. We're changing it to positive :)");
    } else {
      this.account_balance = account_balance;
    }
  }

  public void deposit(double p_deposit) {
    if (p_deposit < 0) {
      p_deposit *= -1;
      account_balance += p_deposit;
      System.out.println("You've entered a negative number. We're changing it to positive :)");
    } else {
      account_balance += p_deposit;
    }
  }

  public double computeCharge() {
    if (this.account_balance < 50) {
      return 10;
    } else {
      return 0;
    }
  }

  public String toString() {
    String stat1 = "account_no=" + account_no;
    String stat2 = "account_balance=" + account_balance;
    return stat1 + "," + stat2;
  }
}
