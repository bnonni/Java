public class Employer {
 public static void main(String[] args) {
  EmployeeReference stack = new EmployeeReference();
  Employee john = new Employee("John Smith", "112-34-0043", 45120.00);
  Employee jane = new Employee("Jane Smith", "443-21-9928", 55225.00);
  Employee steve = new Employee("Steve Jones", "986-33-8238", 105550.00);
  Employee stacy = new Employee("Stacy Jones", "443-21-9928", 32525.00);
  Employee[] employees = { john, jane, steve, stacy };
  System.out.print("\n**Pushing employee record to stack**\n");
  for (Employee x : employees) {
   stack.push(x);
   System.out.print(x.getEmployeeRecord());
   System.out.print("**Employee " + x.getEmployeeName() + " record push complete**\n");
  }
  Employee a = stack.pop();
  String a_record = a.getEmployeeRecord();
  System.out.print("\n**Popping " + a.getEmployeeName() + " record off stack**\n");
  System.out.print("\nEmployee record pop complete: " + a_record);
  Employee p = stack.peek();
  String peek_record = p.getEmployeeRecord();
  System.out.print("\n**Peeking top employee record of stack**\n");
  System.out.print("\nEmployee record peek complete: " + peek_record);
  System.out.print("\n**Displaying all employee records**\n");
  stack.displayStack();
  System.out.print("\n**Employee record display complete**\n");
  if (stack.isEmpty() == false) {
   System.out.println("\n**Stack Not Empty. Employee Records Exist**\n");
  }
  ;
 }
}