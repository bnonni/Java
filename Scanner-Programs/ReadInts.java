import java.util.*;

public class ReadInts{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integers (you choose how many): ");
        int n = 5;
        int i = 1;
        double sum = 0;
        while(i <= n){   
            int a = in.nextInt();
            i++;
            sum=sum+a;
        }
        System.out.println();
        System.out.println("The average of your numbers is: " + sum/n);
        System.out.println();
    }
}