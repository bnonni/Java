public class DeckStack implements DeckStackInterface {
 final int MAX_CARD_STACK = 52;
 private Object arr[];
 private int top;
 private int j;

 public DeckStack() {
  arr = new Object[MAX_CARD_STACK];
  top = -1;
 }

 public void print() {
  for (j = 51; j >= 0; j--) {
   System.out.print(arr[j] + " ");
  }
  System.out.println("\n");
 }

 @Override
 public boolean isEmpty() {
  return top < 0;
 }

 @Override
 public boolean isFull() {
  return top == MAX_CARD_STACK - 1;
 }

 @Override
 public void push(Object card) throws StackException {
  if (!isFull()) {
   arr[++top] = card;
  } else {
   throw new StackException("StackException on push: stack full");
  }
 }

 @Override
 public void popAll() {
  arr = new Object[MAX_CARD_STACK];
  top = -1;
 }

 @Override
 public Object pop() throws StackException {
  if (!isEmpty()) {
   return arr[top--];
  } else {
   throw new StackException("Stack Exception on pop: stack empty");
  }
 }

 @Override
 public void peek() throws StackException {
  throw new StackException("Ah ah ah! That's cheating!");
 }

 @Override
 public void shuffle(Object[] deck, Integer length) {
  popAll();
  for (int i = 0; i < length; i++) {
   int index = (int) (Math.random() * length);
   Object temp = deck[i];
   deck[i] = deck[index];
   deck[index] = temp;
   push(deck[i]);
  }
 }
}