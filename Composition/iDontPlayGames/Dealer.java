public class Dealer {
 public static void main(String[] args) {
  DeckOfCards d = new DeckOfCards();
  String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

  // string array of suits
  String[] suit = { "\u2665", "\u2666", "\u2663", "\u2660" };
  for (int i = 0; i < d.getDeckSize(); i++) {
   Card card = new Card(rank[i], suit[i]);
   CardGame deck = new DeckOfCards(card);
  }
 }
}