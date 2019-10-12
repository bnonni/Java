public interface StackInterface {
 public boolean isEmpty();

 public boolean isFull();

 public void popAll();

 public void push(Integer i) throws StackException;

 public Integer pop() throws StackException;

 public Integer peek() throws StackException;

 public class StackException extends java.lang.RuntimeException {
  public StackException(String s) {
   super(s);
  }
 }
}