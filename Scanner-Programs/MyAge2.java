import java.util.Scanner; 
 
public class MyAge2{
    public static void main(String[] args) {
        // Create a Scanner object 
       Scanner scan = new Scanner(System.in); 
       // Read values from Console 
        
       System.out.print("My Age is "); 
       int age = scan.nextInt(); 
        
       System.out.print("Twice my age is "); 
       int twice = scan.nextInt(); 
        
       System.out.print("Three times my age is "); 
       int three = scan.nextInt(); 
        
       System.out.print("Half my age is "); 
       int half = scan.nextInt(); 
        
       System.out.print("My gpa is "); 
       Double gpa = scan.nextDouble(); 
        
       System.out.print("Half my gpa is "); 
       int halfGpa = scan.nextInt(); 
        
       // Display entered values 
       System.out.println(); 
       System.out.printf("%d %d %d %d %.2f %.2f", age, twice, three, half, gpa, halfGpa);
}
}