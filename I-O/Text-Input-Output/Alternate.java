
// Author: Bryan Nonni
// Date: 2-7-2019
// Class: CSC 2720, MW @ 12:30PM
// Question 2) (25 points): Write a java program that counts the number of times 'x' appears in the file named 'file01.txt'
// Program Requirements:
// - find the src directory of thr program )path of the file must nost be hard coded
// - use a reader to read the file
// - include a try catch block to check if the file exists
// - print the number of x detected in the file to the console

import java.io.*;

public class Alternate {
 // Question2 program takes the file name as an argument given from the terminal.
 // Run program as such 'java Question2 File01.txt'
 public static void main(String[] args) throws IOException {
  // Check for existence of file in args
  // if (args.length < 1) {
  // System.out.println("Error, usage: java ClassName inputfile");
  // System.exit(1);
  // }
  // Initiate try block to capture and read file
  try {
   // Capture fileName into a variable
   String dir = System.getProperty("user.dir");

   File fileName = new File(dir + "/File01.txt");
   // args[0]
   // Construct File Reader and pass it the fileName
   FileInputStream reader = new FileInputStream(fileName);
   // Declare new variables: x & count
   int x, count = 0;
   // Use while loop to check file
   while ((x = reader.read()) != -1) {
    // Capture each character in file as an int and cast to char
    char character = (char) x;
    // Use conditional logic to count up everytime an 'x' is found
    if (character == 'x') {
     count++;
    }
   }
   // Print out the final count to console
   System.out.println("The file contains " + count + " x's.");
   // Close reader for good form
   reader.close();
   // Catch block to throw & print general Exception e
  } catch (Exception e) {
   System.out.println(e);
  }
 }
}