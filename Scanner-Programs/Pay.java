import java.util.*;

public class Pay{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hourly pay.");
        double sal = input.nextDouble();
        System.out.println("Enter # of hours worked.");
        int hour = input.nextInt();
        pay(sal,hour);
    }
    public static void pay(double salary, int hours){
        if(hours < 8){
            double money = salary*hours;
            System.out.print(money);
        }
        else if(hours >= 8){
            double normalTime = salary*8;
            double overTime = salary*(hours-8);
            double totalPay = overTime+normalTime;
            System.out.println("Normal pay: $" + normalTime + "\n" + "Overtime Pay: $" + overTime + "\n" + "Total Pay: $" + totalPay);
        }
    }

}