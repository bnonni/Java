
public class CardGame implements CardGameInterface {
 final int DECK_SIZE = 52;
 private Card deck[];
 private int top;

 public CardGame() {
  deck = new Card[DECK_SIZE];
  top = -1;
 }

 @Override
 public boolean isEmpty() {
  return top < 0;
 }

 @Override
 public boolean isFull() {
  return top == DECK_SIZE - 1;
 }

 @Override
 public void popAll() {
  deck = new Card[DECK_SIZE];
  top = -1;
 }

 // peek
 @Override
 public void cheat() throws CardGameRulesViolation {
  throw new CardGameRulesViolation("Card Game Rules Violation: Peeking is not allowed!");
 }

 @Override
 public void shuffle(Card[] deck, Integer length) {
  popAll();
  for (int i = 0; i < length; i++) {
   int index = (int) (Math.random() * length);
   Card temp = deck[i];
   deck[i] = deck[index];
   deck[index] = temp;
   createDeck(deck[i]);
  }
  System.out.println("Cards are shuffled.");
 }

 // push
 @Override
 public void createDeck(Card c) throws CardGameRulesViolation {
  if (!isFull()) {
   deck[++top] = c;
  } else {
   throw new CardGameRulesViolation("Card Game Rules Violation: The deck is full! Don't stuff the deck!");
  }
 }

 // pop
 @Override
 public Card deal() throws CardGameRulesViolation {
  if (!isEmpty()) {
   return deck[top--];
  } else {
   throw new CardGameRulesViolation("Card Game Rules Violation: stack empty");
  }
 }
}