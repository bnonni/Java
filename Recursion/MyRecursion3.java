public class MyRecursion3 {
 public static void main(String[] args) {
  System.out.println(multiplyOdd(3));
 }

 public static int multiplyOdd(int x) {
  if (x == 1) {
   return x;
  } else {
   return (x * 2 - 1) * multiplyOdd(x - 1);
  }
 }
}

// multiplyOdd(3) = (3 * 2 - 1) = 6 - 1 = 5 * multiplyOdd(3 - 1) = 5 *
// multiplyOdd(2) = 5 * 3 = 15
// multiplyOdd(2) = (2 * 2 - 1) = 4 - 1 = 3 * multiplyOdd(2 - 1) = 3 *
// multiplyOdd(1) = 3 * 1 = 3
// multiplyOdd(1) = 1

// Ans: 15