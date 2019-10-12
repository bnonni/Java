
public class Card extends Dealer {
 public String suit, rank;

 public Card() {
  suit = "";
  rank = "";
 }

 public Card(String suit, String rank) {
  this.suit = suit;
  this.rank = rank;
 }

 public void dealCard() {
  System.out.println(suit + rank);
 }

}
