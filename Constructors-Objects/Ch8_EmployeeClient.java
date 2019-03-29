public class Ch8_EmployeeClient {
 public static void main(String[] arg){
 try{
 Ch8_Employee john = new Ch8_Employee();
 john.secret(50);
 System.out.println(john);
  } catch(IllegalArgumentException e){
 System.out.println("Error");
  }
 }
 }