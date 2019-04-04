public class CardGame {
 private DeckOfCards deck_of_cards;

 // default constructor values
 private String default_game;
 private int default_number_players;
 private boolean default_is_fun;

 // parameterized constructor values
 private String name_of_game;
 private int number_players;
 private boolean is_fun;

 public CardGame() {
  this.default_game = "Solitaire";
  this.default_number_players = 1;
  this.default_is_fun = false;
  this.deck_of_cards = deck_of_cards;
 }

 public CardGame(String name_of_game, int number_players, boolean is_fun) {
  this.name_of_game = name_of_game;
  this.number_players = number_players;
  this.is_fun = is_fun;
  this.deck_of_cards = deck_of_cards;
 }

 public void setCardGameName(String name_of_game) {
  this.name_of_game = name_of_game;
 }

 public void setNumberOfPlayers(int number_players) {
  this.number_players = number_players;
 }

 public void setIsFun(boolean is_fun) {
  this.is_fun = is_fun;
 }

 public String getCardGameName(String name_of_game) {
  return name_of_game;
 }

 public int getNumberOfPlayers(int number_players) {
  return number_players;
 }

 public boolean getIsFun(boolean is_fun) {
  return is_fun;
 }

 public static void main(String[] args) {
  String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
  // string array of suits
  String[] suit = { "\u2665", "\u2666", "\u2663", "\u2660" };
  Card card1 = new Card(suit[0], rank[0]);
  Card card2 = new Card(suit[1], rank[2]);
  Card card3 = new Card(suit[2], rank[4]);
  Card card4 = new Card(suit[3], rank[6]);
  Card card5 = new Card(suit[0], rank[8]);
  System.out.println("Card 1: " + card1.dealCard() + "\nCard 2: " + card2.dealCard() + "\nCard 3: " + card3.dealCard()
    + "\nCard 4: " + card4.dealCard() + "\nCard 5: " + card5.dealCard());
 }
}