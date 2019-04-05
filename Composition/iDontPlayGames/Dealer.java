public class Dealer {
 String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
 // string array of suits
 String[] suit = { "\u2665", "\u2666", "\u2663", "\u2660" };
 Card card1 = new Card(suit[0], rank[0]);
 Card card2 = new Card(suit[2], rank[2]);

 public void startGame() {
  card1.dealCard();
  card2.dealCard();
 }
}