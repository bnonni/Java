import java.util.*;

public class PrintSquare{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        float number = input.nextFloat();
        System.out.println("The square of that number is: " + Math.pow(number, 2));
    }
}