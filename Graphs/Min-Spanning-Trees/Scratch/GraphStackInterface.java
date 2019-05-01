public interface GraphStackInterface {
 public boolean isEmpty();

 public void popAll();

 public void push(Integer i) throws GraphStackException;

 public Integer pop() throws GraphStackException;

 public Integer peek() throws GraphStackException;

 public class GraphStackException extends java.lang.RuntimeException {
  public GraphStackException(String s) {
   super(s);
  }
 }
}