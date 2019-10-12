public class SumRecursive {
 public static void main(String[] args) {
  System.out.println(sumAll(3));
 }

 public static int sumAll(int x) {
  if (x == 1) {
   return x;
  } else {
   return x + sumAll(x - 1);
  }
 }
}
// 1. 3 + 3 = 6
// 2. sumAll(2) = 3
// 3. sumAll(1) = 1