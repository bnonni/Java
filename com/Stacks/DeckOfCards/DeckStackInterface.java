public interface DeckStackInterface {
 public boolean isEmpty();

 public boolean isFull();

 public void popAll();

 public void peek() throws StackException;

 public void shuffle(Object[] d, Integer l);

 public void push(Object i) throws StackException;

 public Object pop() throws StackException;

 public class StackException extends RuntimeException {
  public StackException(String s) {
   super(s);
  }
 }
}