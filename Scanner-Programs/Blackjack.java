import java.util.*;

public class Blackjack{
    public static void main(String[] args){
        System.out.println();
        System.out.println("Welcome to Blackjack!");
        System.out.println();
        int max = 10;
        int min = 1;
        double playerCard1 = Math.floor(Math.random() * (max - min -1) + 1);
        double playerCard2 = Math.floor(Math.random() * (max - min -1) + 1);
        double playerTotal = playerCard1 + playerCard2;
        System.out.println("You drew: " + playerCard1 + " " + playerCard2);
        System.out.println();
        System.out.println("Your Total is: " + playerTotal);
        System.out.println();
        double dealCard1 = Math.floor(Math.random() * (max - min -1) + 1);
        double dealCard2 = Math.floor(Math.random() * (max - min -1) + 1);
        double dealerTotal = dealCard1 + dealCard2;
        System.out.println("The dealer has: " + dealCard1 + " " + dealCard2);
        System.out.println();
        System.out.println("Dealers total is: " + dealerTotal);
        System.out.println();
        
        if(playerTotal <= dealerTotal){
            System.out.println("Dealer wins. Try again!");
            System.out.println();
        }else if(playerTotal>dealerTotal){
            System.out.println("YOU WIN!");
            System.out.println();
        }

        
    }
}