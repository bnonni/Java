import java.util.*;

public class RolltheDice{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double roll1 = Math.floor(Math.random() * (6 - 1 + 1) + 1);
        double roll2 = Math.floor(Math.random() * (6 - 1 + 1) + 1);

        double total = roll1 + roll2;

        System.out.println("The first die comes up as: " + roll1);
        System.out.println("The second die comes up as: " + roll2);
        System.out.println("Your total roll is: " + total);

    }   
    }
