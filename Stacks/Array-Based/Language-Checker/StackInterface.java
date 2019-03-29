public interface StackInterface {
 public Boolean isEmpty();

 public Boolean isFull();

 public void popAll();

 public void push(Character i) throws StackException;

 public Character pop() throws StackException;

 public Character peek() throws StackException;

 public Integer size();

 public class StackException extends java.lang.RuntimeException {
  public StackException(String s) {
   super(s);
  }
 }
}