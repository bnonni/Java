import java.util.*;

public class Insert{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any 5 numbers.");
        String nums = in.next();
        System.out.print("These are a string: " + nums);
        System.out.println();
        int[] numbers = new int[nums.length()];
        System.out.print("These are now ints:");
    for(int i=0; i<numbers.length; i++){
        numbers[i] = Integer.parseInt(nums.charAt(i)+"");
        System.out.print(numbers[i]);
    }
    System.out.println();
    
    
    }
}