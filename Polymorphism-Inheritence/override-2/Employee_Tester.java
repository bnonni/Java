public class Employee_Tester{ 
 public static void main(String[] args){ 
    Employee johnObj = new Employee("john", 20); 
    System.out.println(johnObj.displayName()); //line a 
    System.out.println(johnObj.displayAge());  //line b 
    Secretary kimObj = new Secretary("kim", 18, 1000); 
    System.out.println(kimObj.displayName()); //line c 
    System.out.println(kimObj.displayAge());  //line d 
    System.out.println(kimObj.displaySalary());  //line e 
   } 
 } 