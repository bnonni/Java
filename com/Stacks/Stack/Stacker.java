import java.util.Arrays;

public class Stacker {
 public static int MAX_INTS = 7;
 public static int j = 1;

 public static void main(String[] args) {
  Stack stack = new Stack();
  Integer arr[] = new Integer[MAX_INTS];
  for (int i = 0; i < MAX_INTS; i++) {
   Integer r = (int) (Math.random() * 100 - 1);
   arr[i] = r;
   if (!stack.isFull()) {
    stack.push(arr[i]);
   }
  }
  System.out.println("\nOriginal Stack Array: " + Arrays.toString(arr) + "\n");
  System.out.println("Last In, First Out");
  while (!stack.isEmpty()) {
   System.out.println(j + ": " + stack.pop());
   j += 1;
  }
  System.out.println();
 }
}