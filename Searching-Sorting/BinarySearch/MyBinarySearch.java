public class MyBinarySearch {
   public static void main(String[] args) {
      int[] a = { -1, 3, 5, 8, 15, 18, 22, 39, 40, 42, 50, 57, 71, 73, 74 };
      int target = 3;
      System.out.println(binarySearch(a, target));
   }

   public static int binarySearch(int[] a, int target) {
      int min = 0;
      int max = a.length - 1;
      while (min <= max) { // 0 <= -1
         int mid = (max + min) / 2; // mid = (0/2) = 0
         if (mid == target) { // 0 == -1 x
            return mid;
         } else if (target > a[mid]) { // -1 > a[0] = -1 > -1 x
            min = mid + 1;
            System.out.print(mid);
         } else {
            max = mid - 1; // 0 - 1 = -1
         }
      }
      return target;
   }
}