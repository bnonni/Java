import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        System.out.print(
                "\n//////////////////////////////////////////////////////////////\n// Solution to Programming Project 5\t\t\t //\n// Program description: Payroll\t\t\t\t    //\n//////////////////////////////////////////////////////////////\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Please enter the number of hours worked: ");
        int work = input.nextInt();

        System.out.println("Please enter your hourly pay: ");
        int hourly = input.nextInt();

        System.out.println("Please enter your federal tax rate (as a decimal): ");
        double tax = input.nextDouble();

        int gross = work * hourly;
        double taxes = gross * tax;
        double net = gross - taxes;
        System.out.println("//////////////////---Employee Details Below---/////////////////////////");
        System.out.println("Employee Name: " + name);
        System.out.println("Hours worked: " + work + ".00");
        System.out.println("Hourly: " + "$" + hourly + ".00");
        System.out.println("Gross Pay: " + "$" + gross + ".00");
        System.out.println("Tax Deducted: " + "$" + taxes + "0");
        System.out.println("Net pay: " + "$" + net + "0");
    }
}