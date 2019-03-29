public class Employee extends EmployeeReference {
  public String employee_name;
  public String employee_ssn;
  public Double employee_salary;

  Employee() {
    employee_name = "";
    employee_ssn = "";
    employee_salary = 0.00;
  }

  Employee(String name, String ssn, Double salary) {
    this.employee_name = name;
    this.employee_ssn = ssn;
    this.employee_salary = salary;
  }

  public String getEmployeeName() {
    return employee_name;
  }

  public String getEmployeeRecord() {
    return "\nName: " + employee_name + "\nSSN: " + employee_ssn + "\nSalary: $" + employee_salary + "0\n";
  }

}