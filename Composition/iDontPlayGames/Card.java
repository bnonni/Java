public class Card extends DeckOfCards {
 public String suit, rank;

 public Card() {
  suit = "";
  rank = "";
 }

 public Card(String suit, String rank) {
  this.suit = suit;
  this.rank = rank;
 }

 public String dealCard() {
  return suit + rank;
 }

 public String getSuit(Card card) {
  return card.suit;
 }

 public String getRank(Card card) {
  return card.rank;
 }
}
