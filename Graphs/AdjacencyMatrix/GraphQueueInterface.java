
public interface GraphQueueInterface {
 public boolean isEmpty();

 public void enqueue(Integer new_item);

 public Integer dequeue() throws GraphQueueException;

 public class GraphQueueException extends RuntimeException {
  public GraphQueueException(String s) {
   super(s);
  }
 }
}