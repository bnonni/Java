
public class Dealer {
 public static final int MAX_DECK = 52;
 public static int j = 1;

 public static void main(String[] args) {
  DeckStack deck_stack = new DeckStack();
  Object deck[] = new Object[MAX_DECK];
  String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
  String[] suit = { "\u2665", "\u2666", "\u2663", "\u2660" };
  for (int i = 0; i < rank.length; i++) {
   for (int j = 0; j < suit.length; j++) {
    if (!deck_stack.isFull()) {
     deck_stack.push(deck[suit.length * i + j] = suit[j] + rank[i]);
    }
   }
  }
  System.out.println("\nUnshuffled Deck:");
  deck_stack.print();
  int len = deck.length;
  deck_stack.shuffle(deck, len);
  System.out.println("Shuffled Deck:");
  deck_stack.print();
 }
}