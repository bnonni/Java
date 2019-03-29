import java.util.*;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        if (isPalindrome(integer)) {
            System.out.println(integer + " is a Palindrome");
        } else {
            System.out.println(integer + " is not a Palindrome");
        }

    }

    public static int reverse(int number) {

        int result = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            result = result * 10 + lastDigit;
            number = number / 10;
        }

        return result;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
