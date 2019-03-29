
//Bryan Nonni
//CSC 2720
//Section: 009

import java.util.*;

public class Lab1 {
 public static void main(String args[]) {
  // set a limit for while loop
  int tries = 0;

  // wrap in while loop to allow user another chance
  while (tries < 10) {

   // create scanner
   Scanner in = new Scanner(System.in);

   // prompt user for input
   System.out.println("Please enter a string followed by a space and then a number (e.g. aabbbb 4)");

   // capture input
   String userString = in.nextLine();

   // create new array using .split at the space
   String[] arr = userString.split(" ", -1);

   // initiate try-catch
   try {
    // check to see if too many strings we're passed by user using conditional
    if (arr.length > 2 || arr.length < 2) {
     // increment the tries
     tries++;
     // print a space for good measure
     System.out.print("\n");
     // throw a custom exception
     throw new Exception(
       "ERROR! Too few or too many expresstions. Please only type one set of letters and a number. \n");
    } else {
     // Assign each arr index to a variable
     String letters = arr[0];
     String num = arr[1];
     // cast num from String to int
     int num1 = Integer.parseInt(num);
     // check to ensure the number isn't 0
     int check = 10 / num1;
     // find the last index of the letter a for substrings
     int lastA = letters.indexOf("b");
     // create substrings for the a's and b's
     String a = letters.substring(0, lastA);
     String b = letters.substring(lastA, letters.length());
     // find the lengths of each determining a^nb^2n
     double lengthA = a.length();
     double lengthB = b.length();
     // check to ensure the lengths match
     if (lengthB != 2 * lengthA) {
      // print a space for good measure
      System.out.print("\n");
      // throw a custom exception
      throw new Exception("ERROR! Please enter a pattern using the format a^nb^2n (e.g. aabbbb) \n");
     } else {
      // set tries to max to end while loop
      tries = 10;
      // create and print "yes" to indicate a successful program
      System.out.println("yes");
     }
    }
    // setup catch statement
   } catch (Exception e) {
    // increment tries for while loop
    tries++;
    System.out.println("No.");
   }
  }
 }
}