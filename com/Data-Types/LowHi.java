import java.util.*;

public class LowHi{
    public static void main(String[] args){
        int value;
        int minValue = Integer.MAX_VALUE;
        int MAX_VALUE = minValue;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<5; i++){  
            System.out.println("Please enter 5 random values: ");
                value = input.nextInt();
                if(value<minValue){
                    minValue = value;
                }
                if(value>minValue){
                    MAX_VALUE = value;
                }

        }
        System.out.println("The minimum number is " + minValue);
        System.out.println("The maximum number is " + MAX_VALUE);

    }
}