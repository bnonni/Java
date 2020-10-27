package Algorithms;
import java.util.Random;

public class BinaryHiringAssistant {
 public static void main(String[] args) {
  Random random = new Random();
  int n = 10;
  int best = -1;
  for (int i = 0; i < n; i++) {
   i = random.nextInt(n);
   if (i > best) {
    best = i;
    System.out.print("Hire: " + i + "\n");
   }
   System.out.print("Next: " + i + "\n");
  }

 }
}