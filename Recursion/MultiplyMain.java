public class MultiplyMain {
 public static void main(String[] args) {
  System.out.println(multiplyEven(3));
 }

 public static int multiplyEven(int x) {
  if (x == 2) {
   return x;
  } else {
   return (x * 2) * multiplyEven(x - 2);
  }
 }
}
