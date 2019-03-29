/*Project 8 ch8 review questions.
Given the following 91 lines of code:
/*1*/
/*2*/
/*3*/ 
/*4*/ public class Ch8_BankAccount {
/*5*/  private String account_no;
/*6*/  private double account_balance;
/*7*/  public Ch8_BankAccount(){
/*8*/    account_no = "";
/*9*/    account_balance = 0.0;
/*10*/  }
/*11*/  public Ch8_BankAccount(String account_no, double account_balance)
/*12*/  {
/*13*/    this.account_no = account_no;
/*14*/    this.account_balance = account_balance;
/*15*/  }
/*16*/  public String getAccount_no() {
/*17*/    return account_no;
/*18*/  }
/*19*/  public double getAccount_balance(){
/*20*/    return account_balance;
/*21*/  }
/*22*/  public void setAccount_no(String account_no){
/*23*/    if(account_no.equals("")){
/*24*/       throw new IllegalArgumentException();
/*25*/    }
/*26*/    this.account_no = account_no;
/*27*/  }
/*28*/  public void setAccount_balance(double account_balance){
/*29*/    if(account_balance < 0){
/*30*/       throw new IllegalArgumentException();
/*31*/   }
/*32*/    this.account_balance = account_balance;
/*33*/  }
/*34*/  public void deposit(double p_deposit){
/*35*/    if(p_deposit < 0) {
/*36*/       throw new IllegalArgumentException();
/*37*/   }
/*38*/    account_balance += p_deposit;
/*39*/  }
/*40*/  public double computeCharge(){
/*41*/    if(this.account_balance < 50){
/*42*/     return 10;
/*43*/    } else {
/*44*/     return 0;
/*45*/    }
/*46*/  }
/*47*/  public String toString(){
/*48*/    String stat1 = "account_no=" +account_no;
/*49*/    String stat2 = "account_balance=" + account_balance;
/*50*/    return stat1 + "," + stat2;
/*51*/  }
/*52*/ }
/*53*/
/*54*/
/*55 write a client class to test BankAccount
/*56*/
/*57*/ public class Ch8_TestBankAccount {
/*58*/  public static void main(String[] arg) {
/*59*/  try {
/*60*/    Ch8_BankAccount john = new Ch8_BankAccount();
/*61*/    john.setAccount_no("abc12345");
/*62*/    System.out.println("1. john's account is " + john.getAccount_no());
/*63*/    john.setAccount_balance(10);
/*64*/    System.out.println("2. john's balance is $" + john.getAccount_balance());
/*65*/    System.out.println("3. john's charge is $" + john.computeCharge());
/*66*/  
/*67*/    String myAccount = 12345;
/*68*/    double myBalance = 50.00;
/*69*/    Ch8_BankAccount kim = new Ch8_BankAccount(myAccount, myBalance);;
/*70*/    System.out.println("4. kim's account is " + kim.getAccount_no());
/*71*/    System.out.println("5. kim's balance is $" + kim.getAccount_balance());
/*72*/    kim.deposit(40.00);
/*73*/    System.out.println("6. kim's balance is $" + kim.getAccount_balance());
/*74*/    System.out.println("7. kim has " + kim.toString());
/*75*/    System.out.println("8. kim has " + kim);
/*76*/
/*77*/    Ch8_BankAccount jay = new Ch8_BankAccount("100200", 70);
/*78*/    System.out.println("9. jay's account is " + jay.getAccount_no());
/*79*/    jay.setAccount_balance(-100);
/*80*/    jay.setAccount_balance(10);
/*81*/    System.out.println("10. jay's balance is $" + jay.getAccount_balance());
/*82*/    jay.deposit(-40);
/*83*/    jay.deposit(20);
/*84*/    System.out.println("11. jay's balance is $" + jay.getAccount_balance());
/*85*/   } catch (IllegalArgumentException e) {
/*86*/       System.out.println("The program has been aborted due to bad data");
/*87*/       System.out.println("Call GSU computer science dept. for assistance.");
/*88*/   }
/*89*/  }
/*90*/ }
/*91*/

//Complete the following questions based on the above 2 classes.
/*1.  Line 60 will call the constructor on ____.
Answer: a. line 7

2. The __ operator is used to instantiate an Java object.
Answer: b. new

2b. Write a Java statement to instantiate 

Answer: c. Ch8_BankAccount John = new Ch8_BankAccount();

3. Line 61 will call the setter on ___.

Answer: b. line 22

4. The output on line 62 is _________.
a. 1. john's account is abc12345
b. john's account is abc12345

5. Line 63 call the method on ___.
a. line 28
b. line 34

6. The output on line 64 is _______.
a. 2. john's balance is $10.0
b. 2. john's balance is $100.0

/*7. The output on line /*6/*5 is _________.
a. /*3. john's charge is $/*10.0
b. /*3. john charge is /*10.0

/*8. Line /*69 call the method on ___.
a. line /*1/*1
b. line /*7

9. The output on line /*70 is __.
a. /*4. kim account = /*1/*2/*3/*4/*5
b. /*4. kim's account is /*1/*2/*3/*4/*5

/*10. The output on line /*7/*1 is ___.
a. kim's balance is $/*50.0
b. kim's account no is $/*50.0
c. /*5. kim's balance is $/*50.0

/*1/*1. Line /*7/*2 will call the method on __.
a. line /*40
b. line /*3/*4

/*1/*2. The method on line /*3/*4 enforces ___.
a. encapsulation
b. class invariant
c. tobacco free

/*1/*3. The output on line /*7/*3 is ___.
a. /*6. kim's balance is $90.0
b. /*6. kim's balance is $/*50.0

/*1/*4. The output on line /*7/*4 is ___.
a. /*7. kim has account_no=/*1/*2/*3/*4/*5,account_balance=90.0
b. kim has account_no=/*1/*2/*3/*4/*5,account_balance=90.0

/*1/*5. The output on line /*7/*5 is __.
a. /*7. kim has account_no=/*1/*2/*3/*4/*5,account_balance=90.0
b. kim has account_no=/*1/*2/*3/*4/*5,account_balance=90.0

/*1/*6. The 'kim.toString' on line /*7/*4 will call ___.
a. line /*40
b. line /*4/*7

/*1/*7. The 'kim' on line /*7/*5 will call __.
a. line /*40
b. line /*4/*7

/*1/*8. The line /*79 will call ___.
a. line /*20
b. line /*2/*8

/*19. The line /*79 ____.
a.  will throw IllegalArgumentException
b.  will not throw IllegalArgumentException

/*20. The output after the execution of line /*79 is ___.
a. The program has been aborted due to bad data
  Call GSU computer science dept. for assistance.
b. The program has an error
  Call 9/*1/*1 for help

/*2/*1. Will line /*80 ever be executed?
a. Yes
b. No

/*2/*2. If lines /*79 and /*8/*2 is commented out (or disabled), 
then the output on line /*8/*4 is ___.
a. jay's balance is $/*30.0
b. jay balance is /*30.0

/*2/*3. There are ___ setters.
a. /*3
b. /*2

/*2/*4. There are ___ constructors.
a. /*1
b. /*2

/*2/*5. Given the object:
Ch/*8_BankAccount obj = new Ch/*8_BankAccount();
Which of the following is a correct way to call and display toString?
a. System.out.println(obj.toString());
b. System.out.println(obj);
c. a & b

/*2/*6. Given variables:
String x = "1/*2/*3";
double y = /*20./*10;
Which of the following is a correct way to instantiate Ch/*8_BankAccount object
called myObj?
a. Ch/*8_BankAccount MyObj = Ch/*8_BankAccount(x);
b. Ch/*8_BankAccount myObj = Ch/*8_BankAccount(y);
c. Ch/*8_BankAccount myObj = new Ch/*8_BankAccount(y, x);
d. Ch/*8_BankAccount myObj = Ch/*8_BankAccount(x, y);
e. Ch/*8_BankAccount x = new Ch/*8_BankAccount(x, y);
f. Ch/*8_BankAccount myObj = new Ch/*8_BankAccount(x, y);


