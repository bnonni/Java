public class Money{
public static void main(String[] args) {
    
     //array of cash money
     int money[] = new int[]{50,25,16,5,99,63,100,3,19};
    
     //assign first element of an array to largest and smallest
     int smallest = money[0];
     int largest = money[0];
    
     for(int i=1; i< money.length; i++)
     {
             if(money[i] > largest)
                     largest = money[i];
             else if (money[i] < smallest)
                     smallest = money[i];
         
 // this  System.out.println shows how the elements are being compared
       System.out.println("money[" + i + "] = " + largest);
            System.out.println("money[" + i + "] = " + smallest);
     } 
     System.out.println("Largest Number is: " + largest);
     System.out.println("Smallest Number is: " + smallest);
}}