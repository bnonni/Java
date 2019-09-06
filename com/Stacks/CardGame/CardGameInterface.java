public interface CardGameInterface {

 public boolean isEmpty();

 public boolean isFull();

 public void popAll();

 public void cheat() throws CardGameRulesViolation;

 public void shuffle(Card[] dk, Integer le);

 public void createDeck(Card o) throws CardGameRulesViolation;

 public Card deal() throws CardGameRulesViolation;

 public class CardGameRulesViolation extends RuntimeException {
  public CardGameRulesViolation(String s) {
   super(s);
  }
 }
}