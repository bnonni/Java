public interface PostFixStackInterface {
 public Boolean isEmpty();

 public Boolean isFull();

 public Integer size();

 public void push(Character c);

 public Character pop() throws PostFixStackException;

 public void popAll();

 public Character peek() throws PostFixStackException;

 public class PostFixStackException extends java.lang.RuntimeException {
  public PostFixStackException(String s) {
   super(s);
  }
 }
}