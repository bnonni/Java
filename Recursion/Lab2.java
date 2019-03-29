public class Lab2 {
 public static void main(String[] args) {
  System.out.println(recursion(126));
 }

 public static int recursion(int x) {
  return x == 0 ? x : ((x % 10) + recursion(x / 10));
 }
}
