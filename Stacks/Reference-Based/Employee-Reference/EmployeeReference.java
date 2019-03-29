public class EmployeeReference implements EmployeeReferenceInterface {
  private Node top;

  public class Node {
    public Employee record;
    public Node next;

    private Node() {
      record = null;
      next = null;
    }

    public Node(Employee r, Node n) {
      record = r;
      next = n;
    }
  }

  public EmployeeReference() {
    top = null;
  }

  @Override
  public void push(Employee ebj) throws EmployeeReferenceException {
    Node temp = new Node();
    top = new Node(ebj, top);
    if (temp == null) {
      throw new EmployeeReferenceException("EmployeeReferenceException on push: no employee record present");
    }
  }

  @Override
  public Employee pop() throws EmployeeReferenceException {
    if (!isEmpty()) {
      Node temp = top;
      top = top.next;
      return temp.record;
    } else {
      throw new EmployeeReferenceException("EmployeeReferenceException on pop: no employee record present");
    }
  }

  @Override
  public Boolean isEmpty() {
    return top == null;
  }

  public Boolean isFull() {
    return top == null;
  }

  @Override
  public void popAll() {
    while (!isEmpty()) {
      System.out.print(pop());
    }
    top = null;
    System.out.println("\nEmployeeRecordStack empty.\n");
  }

  @Override
  public Employee peek() throws EmployeeReferenceException {
    if (!isEmpty()) {
      return top.record;
    } else {
      throw new EmployeeReferenceException("EmployeeReferenceException: Stack Underflow on peek: No Record Present.");
    }
  }

  public void displayStack() throws EmployeeReferenceException {
    int i = 1;
    if (top == null) {
      throw new EmployeeReferenceException(
          "EmployeeReferenceException: Stack Underflow on display: No Record Present.");
    } else {
      Node temp = top;
      while (temp != null) {
        System.out.printf("%d: %s %s $%.2f\n", i, temp.record.employee_name, temp.record.employee_ssn,
            temp.record.employee_salary);
        i++;
        temp = temp.next;
      }
    }
  }

}