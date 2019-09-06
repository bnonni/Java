import java.util.*;
public class Armstrong{  
    public static void main(String[] args)  {  
        Scanner in = new Scanner(System.in);
      int c = 0, a, temp;  
      System.out.println("Enter a nunber: ");
      int n = in.nextInt();
      temp = n;  
      while(n > 0)  
      {  
      a=n%10;  
      System.out.println("a = " + a);
      n=n/10;
      System.out.println("n = " + n);  
      System.out.println("c = " + c);
      c=c+(a*a*a);  
      System.out.println("c = " + c);
      }  
      if(temp==c)  
      System.out.println(temp + " is an Armstrong number");   
      else  
          System.out.println(temp + " is not an armstrong number");   
     }  
  }  