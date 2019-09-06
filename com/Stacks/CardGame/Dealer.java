import java.util.*;
import java.util.Scanner;

public class Dealer {
 public static final int DECK_SIZE = 52;
 public static int j = 1;

 public static void main(String[] args) {
  // create new CardGame object to instantiate stack deck
  CardGame deck = new CardGame();

  // create new Card object to hold suit & rank; initialize to null
  Card card = new Card(null, null);

  // create new array based stack to hold cards
  Card deckArr[] = new Card[DECK_SIZE];

  // scanner for user IO
  Scanner in = new Scanner(System.in);

  // string array of ranks
  String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
  // string array of suits
  String[] suit = { "\u2665", "\u2666", "\u2663", "\u2660" };
  // create card objects, suit strings
  Card user_card1, user_card2, cpu_card1, cpu_card2;
  String user_suit1, user_suit2, cpu_suit1, cpu_suit2;
  Integer len = deckArr.length;
  String answer = in.nextLine();
  String yes = "y";
  String cheat = "cheat";
  for (int i = 0; i < rank.length; i++) {
   for (int j = 0; j < suit.length; j++) {
    if (!deck.isFull()) {
     String s = suit[j];
     String r = rank[i];
     card = new Card(s, r);
     Integer cl = suit.length * i + j;
     deckArr[cl] = card;
     deck.createDeck(deckArr[cl]);
    }
   }
  }

  System.out.println("\nWelcome to 2 Card Draw! Here is the deck:");
  card.printCards(deckArr);
  System.out.println("\nShuffling cards. Please Wait...");
  deck.shuffle(deckArr, len);
  System.out.println("\nDealing cards to Player 1...");
  System.out.println("\nWould you like to play? (y/n)");

  // cheat code
  while (answer.toLowerCase().equals(cheat)) {
   user_card1 = new Card("\u2660", "A");
   user_card2 = new Card("\u2660", "A");
   System.out.println("You found the cheat code!");
   System.out.println("Your cards are: " + card.getCard(user_card1) + " " + card.getCard(user_card2));
   System.out.println("\nYou win! Would you like to play again? (y/n)");
   answer = in.nextLine();
  }

  // card game loop
  while (answer.toLowerCase().equals(yes)) {
   user_card1 = deck.deal();
   user_suit1 = card.getSuit(user_card1);
   user_card2 = deck.deal();
   user_suit2 = card.getSuit(user_card2);
   System.out.println("You have: " + card.getCard(user_card1) + " " + card.getCard(user_card2));
   System.out.println("\nDealing cards to computer...");
   cpu_card1 = deck.deal();
   cpu_suit1 = card.getSuit(cpu_card1);
   cpu_card2 = deck.deal();
   cpu_suit2 = card.getSuit(cpu_card2);
   System.out.println("Computer has: " + card.getCard(cpu_card1) + " " + card.getCard(cpu_card2));
   Boolean compare1 = (user_suit1.equals(user_suit2)) && !(cpu_suit1.equals(cpu_suit2));
   Boolean compare2 = !(user_suit1.equals(user_suit2)) && (cpu_suit1.equals(cpu_suit2));
   Boolean compare3 = ((user_suit1.equals(user_suit2)) && (cpu_suit1.equals(cpu_suit2)));
   if (compare1) {
    System.out.println("\nPlayer 1: Card 1 Suit = " + user_suit1);
    System.out.println("Player 1: Card 2 Suit = " + user_suit2);
    System.out.println("\nComputer: Card 1 Suit = " + cpu_suit1);
    System.out.println("Computer: Card 2 Suit = " + cpu_suit2);
    System.out.println("\nYou win! Computer lost! Congratulations! Game over... ");
    System.out.println("\nUnless.. would you like to play again? (y/n)");
    answer = in.nextLine();
   } else if (compare2) {
    System.out.println("\nPlayer 1: Card 1 Suit = " + user_suit1);
    System.out.println("Player 1: Card 2 Suit = " + user_suit2);
    System.out.println("\nComputer: Card 1 Suit = " + cpu_suit1);
    System.out.println("Computer: Card 2 Suit = " + cpu_suit2);
    System.out.println("\nComputer Wins. You lost. Game over... ");
    System.out.println("\nUnless.. would you like to play again? (y/n)");
    answer = in.nextLine();
   } else if (compare3) {
    System.out.println("\nPlayer 1: Card 1 Suit = " + user_suit1);
    System.out.println("Player 1: Card 2 Suit = " + user_suit2);
    System.out.println("\nComputer: Card 1 Suit = " + cpu_suit1);
    System.out.println("Computer: Card 2 Suit = " + cpu_suit2);
    System.out.println("\nIt's a tie! Try again!");
    System.out.println("\nWould you like to play again? (y/n)");
    answer = in.nextLine();
   } else {
    System.out.println("\nPlayer 1: Card 1 Suit = " + user_suit1);
    System.out.println("Player 1: Card 2 Suit = " + user_suit2);
    System.out.println("\nComputer: Card 1 Suit = " + cpu_suit1);
    System.out.println("Computer: Card 2 Suit = " + cpu_suit2);
    System.out.println("\nNo one wins! Try again!");
    System.out.println("\nWould you like to play again? (y/n)");
    answer = in.nextLine();
   }
  }
  System.out.println("Thanks for playing! Come back soon!");
 }
}
