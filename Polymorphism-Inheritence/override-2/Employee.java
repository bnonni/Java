public class Employee {
 private String name; 
 private int age;  

 public Employee(String name, int age){ 
    this.name = name; 
    this.age = age;} 
 
 public int getAge(){return age;} 
 public String displayName(){return "Employee name is " + name; } 
 public String displayAge(){return "Employee age is " + age;} 
 public String displaySalary(){return "Employee salary is unknown";}  
}