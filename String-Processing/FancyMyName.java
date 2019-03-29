import java.util.*;

public class FancyMyName{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and last name like this: John Doe.");
        String name = input.nextLine();
    
        int length = name.length();
        int space = name.indexOf(' ');
        String B = name.substring(0, 1);
        String N = name.substring(space, space+2);
        String last = name.substring(space+2, length);
        
        System.out.println("You entered the name: " + N.toUpperCase() + last + ", " + B.toUpperCase() + ".");
       //System.out.println("Your first name is "+first+", and it has " +firstLength+" letters.");
       //System.out.println("Your last name is "+last+", and it has " +lastLength+" letters.");
       //System.out.println("Your initials are: "+first.charAt(0) + last.charAt(0));
    }
}