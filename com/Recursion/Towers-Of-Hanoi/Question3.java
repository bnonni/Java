
// Author: Bryan Nonni
// Date: 2-7-2019
// Class: CSC 2720, MW @ 12:30PM
// Question 3) (60 points): Write a java program to solve a Towers of Hanoi problem recursively given the number of disks. At last move, all the disks must be on the last peg.
// Program Requirements:
// - prompt the user for the number of disks
// - display the steps, one per line
// - indicate the source peg & the destination peg (see sample below) for each step
// - sequentially number the steps
// - print results as below (example with 3 disks and 0 disks):
// How many disks? (0 to end)
// 3
// 1: 1 to 3
// 2: 1 to 2
// 3: 3 to 2
// 4: 1 to 3
// 5: 2 to 1
// 6: 2 to 3
// 7: 1 to 3
// Total Moves: 7

import java.util.Scanner;

public class Question3 {
 public static int stepCount;

 public static void towerSolver(int n, int one, int two, int three) {
  if (n == 0) {
   return;
  } else {
   towerSolver(n - 1, one, three, two);
   stepCount++;
   System.out.println(stepCount + ": " + one + " to " + three);
   towerSolver(n - 1, two, one, three);
  }
 }

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("How many disks? (0 to __)");
  int disks = in.nextInt();
  int moves = (int) Math.pow(2, disks) - 1;
  stepCount = 0;
  towerSolver(disks, 1, 2, 3);
  System.out.println("Number of moves: " + moves);
  in.close();
 }

}