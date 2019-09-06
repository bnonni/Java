import java.util.*;

public class ReverseString1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your favorite food.");
        String aString = input.next();
        
        int length = aString.length();
        for(int i = 1; i<=length; i++){
        System.out.print(aString.charAt(length-i));
        }
        System.out.println();

    }
}