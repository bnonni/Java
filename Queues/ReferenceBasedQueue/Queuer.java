import java.util.Random;

public class Queuer {
 private static int size = 10;

 public static void main(String[] args) {
  Queue queue = new Queue();
  Queuer method = new Queuer();
  for (int i = 0; i < size; i++) {
   String rand = method.genRandomString();
   String[] str = new String[10];
   System.out.print("Add " + i + ": ");
   str[i] = rand + " ";
   queue.enqueue(str[i]);
   queue.print();
   System.out.println();
  }
  System.out.println("\n");
  System.out.print("Full Queue: ");
  queue.print();
  System.out.println("\n");
  for (int i = 0; i < size - 1; i++) {
   queue.dequeue();
   System.out.print("Delete: " + i + ": ");
   queue.print();
   System.out.println();
  }
  System.out.print("Delete: " + (size - 1) + ": Empty Queue");
  System.out.println("\n");
 }

 public String genRandomString() {
  int leftLimit = 97; // letter 'a'
  int rightLimit = 122; // letter 'z'
  int targetStringLength = 5;
  Random random = new Random();
  StringBuilder buffer = new StringBuilder(targetStringLength);
  for (int i = 0; i < targetStringLength; i++) {
   int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
   buffer.append((char) randomLimitedInt);
  }
  String generatedString = buffer.toString();

  return generatedString;
 }
}