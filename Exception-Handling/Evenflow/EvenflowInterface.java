public interface EvenflowInterface {
 public void addition(int i, int j) throws OverUnderFlowException;

 public void subtraction(int k, int l) throws OverUnderFlowException;

 public class OverUnderFlowException extends ArithmeticException {
  public OverUnderFlowException(String s) {
   super(s);
  }
 }
}