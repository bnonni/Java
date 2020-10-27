public class LoanCalc {
 public static void payment(double loan_amt, double rate, double future_value, int num_periods) {
  double interest = rate / 100.0;
  System.out.println("interest: " + interest);
  double partial1 = Math.pow((1 + interest), -(num_periods));
  System.out.println("partial: " + partial1);
  double denom = (1 - partial1) / interest;
  System.out.println("denom: " + denom);
  double answer = -loan_amt - (future_value / denom);
  System.out.println("ans: " + answer);
 }

 public static void main(String[] args) {
  // your code here
  // double result =
  // System.out.println(-4.30974798128268);
  payment(2.0, 5.0, 10.0, 5);
 }
}