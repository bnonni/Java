public interface EmployeeReferenceInterface {
 public Boolean isEmpty();

 public void push(Employee e);

 public Employee pop() throws EmployeeReferenceException;

 public void popAll();

 public Employee peek() throws EmployeeReferenceException;

 public class EmployeeReferenceException extends java.lang.RuntimeException {
  public EmployeeReferenceException(String s) {
   super(s);
  }
 }
}