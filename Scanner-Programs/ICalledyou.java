import java.util.Scanner;

public class ICalledyou{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number, any number!");        
        float anynum = input.nextFloat();
        
        System.out.println("Enter another number, any number!");
        float anothernum = input.nextFloat();

        float product = anynum*anothernum;
        System.out.println("The product of your two numbers = " + product);
        
        System.out.println("Enter a third number, any number!");
        float third = input.nextFloat();

        System.out.println("Enter a fourth number, any number!");
        float fourth = input.nextFloat();

        System.out.println("The bigger number = " + Math.max(third, fourth));

        System.out.println("Now, let's get tricky! Enter a binary number!");
        String binary = input.next();

        int convert = Integer.parseInt(binary, 2);
        System.out.println("The decimal conversion of your binary = " + convert);

        System.out.println("How about entering a decimal number? Base 2 please!");
        int decimal = input.nextInt();

        String conversion = Integer.toBinaryString(decimal);
        
        System.out.println("The binary conversion of your base 2 number = " + conversion);
    }
}