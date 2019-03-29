//Bryan Nonni
//CSC 2720
//Section: 009

import java.util.*;

public class PartTwo{
 public static void main(String args[]){
  //set a limit for while loop
  int tries = 0;
   
   //create scanner
   Scanner in = new Scanner(System.in);

   //prompt user for input
   System.out.println("Please enter a string followed by a space and then a number (e.g. aabbbb 4)");

   //capture input
   String userString = in.nextLine();

   //create new array using .split at the space
   String[] arr = userString.split(" ", -1);

   //initiate try-catch
   try{
    String catch1 = arr[2];
    
    //setup catch statement
   }catch(Exception e){
    //increment tries for while loop
    int num1 = Integer.parseInt(arr[1]);
    int catch2 = 10/num1;
   }try{
     int bIndex = arr[0].indexOf("b");
     String a = arr[0].substring(0, bIndex);
     String b = arr[0].substring(bIndex, arr[0].length());     
     //find the lengths of each determining a^nb^2n
     double lenA = a.length();
     double lenB = b.length();
     boolean catch3 = (lenB == (2*lenA));
     catch3 == true ? System.out.println("yes") : break;
   }catch(Exception e){
    System.out.println("Bad format.");
   }  
 }
}