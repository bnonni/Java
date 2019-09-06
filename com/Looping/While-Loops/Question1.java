
// Author: Bryan Nonni
// Date: 2-7-2019
// Class: CSC 2720, MW @ 12:30PM
// Question 1) (15 points): Write a java program with a while statement that will only print out the numbers 50, 45, 40, 35, 30, 25.

import java.util.*;

public class Question1 {
 public static void main(String[] args) {
  int x = 50;
  while (x >= 25) {
   System.out.println(x);
   x -= 5;
  }
 }
}