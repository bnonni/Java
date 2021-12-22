
// 1. import utilities
import java.util.Arrays;

// 2. decalre MergeSort object class
public class MergeSort {
 // 3. declare main method
 public static void main(String[] args) {
  // 4. declare program start time var
  long startTime = System.nanoTime();
  // 5. instantiate empty array of 100 ints
  int[] arr = new int[100];
  // 6. use for loop to generate 100 random ints
  for (var i = 0; i <= 99; i++) {
   // 7. declare b variable to create random ints
   int b = (int) (Math.random() * 100 - 1);
   // 8. store each random int in a array
   arr[i] = b;
  }
  // 9. print unsorted arr
  System.out.println("\nUnsorted arr = " + Arrays.toString(arr) + "\n________________");

  // 10. initiate splitting of arr using split method
  split(arr);

  // 22. Print sorted array
  System.out.println("\nMerge Sort:\n\nSorted arr = " + Arrays.toString(arr));

  // 23. declare program end time var, calc runtime, print runtime
  long endTime = System.nanoTime();
  long nanoTime = endTime - startTime;
  long milliTime = nanoTime / 1000000;
  System.out.println("\nMerge Sort took: " + nanoTime + " nanoseconds.");
  System.out.println("\nMerge Sort took: " + milliTime + " milliseconds.\n");
 }

 // 11. declare split method and pass arr to sortArr
 public static void split(int[] sortArr) {
  // 12. check if sortArr.length is > 1, if so, begin breaking down sortArr into
  // smaller arrays
  if (sortArr.length > 1) {

   // 13. split array into two smaller arrays
   // half1 splits sortArr from 0 index to 50 on first pass and
   int[] half1 = Arrays.copyOfRange(sortArr, 0, sortArr.length / 2);
   // half2 splits sortArr from 50 index to 100 on first pass and
   int[] half2 = Arrays.copyOfRange(sortArr, sortArr.length / 2, sortArr.length);

   // 14. recursively call split method on each half to contiue to break down
   // halves into smaller arrays
   split(half1);
   split(half2);

   // 15. call merge method to merge halves in sorted array
   mergeSort(sortArr, half1, half2);
  }
 }

 // 16. instantiate mergeSort method to sort and merge each half
 public static void mergeSort(int[] result, int[] list1, int[] list2) {
  // 17. declare tickers to aid mergeSort
  int i1 = 0;
  int i2 = 0;
  // 18. for loop to iterate through each half
  for (int i = 0; i < result.length; i++) {
   // 19. if stmt compares the length of each half against the tickers above
   // and compares the indexes of each half to determine which int is smaller
   if (i2 >= list2.length || (i1 < list1.length && list1[i1] < (list2[i2]))) {
    // 20. upon satisfying the condition, the loop then adds the smaller int from
    // half1 into a new array called results and increments the i1 counter
    result[i] = list1[i1];
    i1++;
   } else {
    // 21. if condition is not satisfied, the int in half2 is smaller than the
    // int in half1 and is added to the results array; increment i2 counter
    result[i] = list2[i2];
    i2++;
   }
  }

 }

}