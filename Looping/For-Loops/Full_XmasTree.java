import java.util.*;

public class Full_XmasTree {
    public static void main (String[] args){
         Scanner in = new Scanner(System.in);
         System.out.println("Enter a number (must be an integer)");
         int rows = in.nextInt();
        for(int i = 0; i <= rows; i++) {
            for(int j = rows; j > 0; j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}