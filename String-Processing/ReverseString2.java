import java.util.*;

public class ReverseString2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your favorite food.");
        String aString = input.next();
        String reverse = new StringBuffer(aString).reverse().toString();
        System.out.println(reverse);
    }
}