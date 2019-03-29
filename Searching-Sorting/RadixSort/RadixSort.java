import java.util.Arrays;

public class RadixSort {

 public static void main(String[] args) {
  int[] uArr = new int[100];

  // 6. use for loop to generate 100 random ints
  for (int i = 0; i < 100; i++) {
   // 7. Use Math class to create 100 random ints between 0 - 99
   int r = (int) (Math.random() * 1000 - 1);
   // 8. store random ints in array arr
   uArr[i] = r;
  }
  System.out.print("Unsorted array: ");
  System.out.println(Arrays.toString(uArr));

  RadixSort rs = new RadixSort();
  rs.radixSort(uArr);

  System.out.print("Sorted array: ");
  // print sorted array
  System.out.println(Arrays.toString(uArr));
  System.exit(0);
 }

 public int getMax(int[] mArr) {
  int max = mArr[0];
  for (int i = 1; i < mArr.length; i++) {
   if (mArr[i] > max) {
    max = mArr[i];
   }
  }
  return max;
 }

 public void radixSort(int[] arr) {
  int place = 1;
  int n = arr.length;
  int result[] = new int[n];
  int largest = getMax(arr);

  while (largest / place > 0) {
   int[] count = new int[10];

   for (int i = 0; i < 10; i++)
    count[i] = 0;

   for (int i = 0; i < n; i++)
    count[(arr[i] / place) % 10]++;

   for (int i = 1; i < 10; i++)
    count[i] += count[i - 1];

   for (int i = n - 1; i >= 0; i--) {
    result[count[(arr[i] / place) % 10] - 1] = arr[i];
    count[(arr[i] / place) % 10]--;
   }

   for (int i = 0; i < n; i++)
    arr[i] = result[i];

   place *= 10;
  }

 }
}