public class Card extends CardGame {
 public String suit, rank;

 Card() {
  suit = null;
  rank = null;
 }

 public Card(String su, String ra) {
  suit = su;
  rank = ra;
 }

 public String getCard(Card c) {
  return c.suit + c.rank;
 }

 public void printCards(Card[] c) {
  for (int k = 51; k > 0; k--) {
   System.out.print(getCard(c[k]) + " ");
  }
 }

 public String getSuit(Card c) {
  return c.suit;
 }

 public String getRank(Card c) {
  return c.rank;
 }
}