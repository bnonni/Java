public class Secretary extends Employee{ 
 private int salary; 
 public Secretary(String name, int age, int salary){ 
    super(name, age); 
    this.salary = salary; 
 } 
 public String toString(){
  return name + " " + salary + " " + age;
 } 
}