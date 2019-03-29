public class Ch8_Employee {
 private int age;
 private int salary;
 public Ch8_Employee(){age = 30; salary = 100;}
 public Ch8_Employee(int age, int salary) {this.age = age; this.salary = salary;}
 public int getAge(){return age;}
 public void setAge(int age){this.age = age;}
 public void secret(int y){this.age = y;}
 public int unknown(int w){
 this.salary += 10;
 return w + secret(w) + getAge();
 }
 public int mystery(int x){
 if(x < 0){ throw new IllegalArgumentException();}
 this.age = x;
 return this.age + this.salary;
 }
 public String toString(){ 
 String s1 = "age=" + age;
 return s1;
 }
 }
 