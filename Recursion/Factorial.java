public class Factorial {
   public static void main(String[] args) {
      System.out.println(fact(3));
   }

   public static int fact(int n) {
      if (n == 1) {
         return 1;
      } else {
         return n * fact(n - 1);
      }
   }
}
// fun(3) = 3 * fun(2) = 3 * 2 = 6
// fun(2) = 2 * fun(1) = 2 * 1 = 2
// fun(1) = 1