public class Secretary extends Employee{ 
 private int salary; 
 public Secretary(String name, int age, int salary){  
    super(name, age); 
    this.salary = salary; 
 }
 public String displaySalary(){return "Secretary salary is " + salary; } 
 public String displayAge(){return "Secretary age is " + super.getAge();} 
 } 
 