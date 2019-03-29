import java.util.Scanner;

public class ICalledyou2{
    public static void main(String[] args){
        
        whatever("Enter a number: ", "Enter another number: ");
        
    }
    public static void whatever(String prompt, String prompt2){
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        float anynum = input.nextFloat();

        System.out.println(prompt2);
        float anothernum = input.nextFloat();
        
    }

}
