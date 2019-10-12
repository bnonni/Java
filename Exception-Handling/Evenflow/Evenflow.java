import java.util.Scanner;

public class Evenflow {
 public static void main(String[] args) {
  EvenflowFunctions evenflow = new EvenflowFunctions();
  Scanner in = new Scanner(System.in);
  System.out.print("Addition: Enter two integers.\n");
  System.out.print("\nInteger 1: ");
  int x = in.nextInt();
  System.out.print("Integer 2: ");
  int y = in.nextInt();
  // use a = 2147483647, b = 1 to throw exception
  evenflow.addition(x, y);
  System.out.print("Subtraction: Enter two more integers.\n");
  System.out.print("\nInteger 1: ");
  int a = in.nextInt();
  System.out.print("Integer 2: ");
  int b = in.nextInt();
  // use a = -2, b = 2147483647 to throw exception
  evenflow.subtraction(a, b);
  in.close();
 }
}