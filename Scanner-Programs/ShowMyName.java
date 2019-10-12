import java.util.*;

public class ShowMyName{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name in the following format: 'John A. Doe.' If you don't have a middle initial, put a space then a period.");
        String name = input.nextLine();
    
        int length = name.length();
        int space = name.indexOf(' ');
        int period = name.indexOf('.');
        String F = name.substring(0, 1);
        String M = name.substring(space+1, space+2);
        String L = name.substring(period+2, period+3);

        int[] a = {1, 3, 4, 5, 6, 13, 23, 56, 20};
        
        
        System.out.println(F.toUpperCase() + M.toUpperCase() + L.toUpperCase());
    }
}