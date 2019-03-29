import java.util.Scanner;

public class Radius {
 private static final Double pi = Math.PI;

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter a radius: ");
  Double r = in.nextDouble();
  Double area = pi * Math.pow(r, 2);
  System.out.println("Area of the circle = " + area);
  in.close();
 }
}