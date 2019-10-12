import java.util.*;

public class GuessNumber{
    public static void main(String[] args){ 
        String playAgain = "Y";
        System.out.println("Welcome to the game Guess That Number!");
        while(playAgain.equalsIgnoreCase("Y")){
            System.out.println("Enter an integer to define the max.");
            Scanner in = new Scanner(System.in);
            int max = in.nextInt(); 
            int tries = 0;
            int count = max;
            int random = (int)Math.floor(Math.random() * (max - 1 + 1) + 1);
            System.out.println("Now, guess a number between 1 and the max you just entered: ");
            int guess = in.nextInt();
            if(guess == random){
                System.out.println("That's right! Good Job!");
                System.out.println("Play again? (Y/n)");
                playAgain = in.next();
            }
            while(guess != random && (tries<count)){
                System.out.println("That's incorrect. Guess again! You have " + max + " tries left");
                max--;
                guess = in.nextInt();
                tries++;
                if(max==0){
                    System.out.println("That was your last guess!");
                }
                if(tries>=count){
                    System.out.println("Sorry, you lost!");
                    System.out.println("Play again? (Y/n)");
                    playAgain = in.next();
                }
                if(guess == random){
                    System.out.println("That's right! Good Job!");
                    System.out.println("Play again? (Y/n)");
                    playAgain = in.next();
                }
            }
        }
    }
}