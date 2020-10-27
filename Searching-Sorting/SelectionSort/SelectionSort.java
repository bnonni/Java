//Bryan Nonni
//CSC 2720 Lab 4
//02-08-2019

// 1. import utilities
import java.util.Arrays;

// 2. decalre SelectionSort class
public class SelectionSort {
  // 3. declare main method
  public static void main(String[] args) {
    // 4. capture program starttime
    long startTime = System.nanoTime();

    // 5. instantiate empty array of 100 ints
    int[] arr = new int[100];

    // 6. use for loop to generate 100 random ints
    for (int i = 0; i <= 99; i++) {
      // 7. Use Math class to create 100 random ints between 0 - 99
      int r = (int) (Math.random() * 100 - 1);
      // 8. store random ints in array arr
      arr[i] = r;
    }
    // 9. print unsorted array
    System.out.println("\nUnsorted arr = " + Arrays.toString(arr) + "\n________________");

    // 10. store arr length
    int n = arr.length;

    // 11. initiate selection of arr elements, pass arr and arr length
    select(arr, n);

    // 21. Print sorted array
    System.out.println("\nSelection Sort:\n\nSorted arr = " + Arrays.toString(arr));

    // 21. declare program end time var, calc runtime, print runtime
    long endTime = System.nanoTime();
    long nanoTime = endTime - startTime;
    long milliTime = nanoTime / 1000000;
    System.out.println("\nThis selection sort took: " + nanoTime + " nanoseconds.");
    System.out.println("\nThis selection sort took: " + milliTime + " milliseconds.\n");
  }

  // 11. declare select method
  public static void select(int[] selArr, int n) {
    // 12. use outer for loop to iterate through selArr
    for (int i = 0; i < n - 1; i++) {

      // 13. set a variable to start at the first index of the array
      int min = i;

      // 14. use inner for loop to grab the next index in the array
      for (int j = i + 1; j < n; j++) {

        // 15. compare the vals @ index 0 & 1
        if (selArr[j] < selArr[min]) {
          // 16. if val @ 1 < val @ 0, reset previous var to next index
          // first round will compare value @ index 0 to value @ index 1
          // if true, previous is reset to index 1 to be swapped with index 0 later
          // if not, the loop restarts & counts up to find a value smaller than the first
          min = j;
        }
      }
      // 17. call sort method & pass arr, previous index, outer loop index
      // sort(selArr, min, i);
      int largerVal = selArr[i];
      // 19. move the smaller value at higherIndex to lowerIndex
      selArr[i] = selArr[min];
      // 20. move the larger value to the higherIndex
      selArr[min] = largerVal;
    }
  }

  // arr, 1, 0
  // public static void sort(int[] selArr, int min, int i) {
  // // 18. store the larger value temporarily
  // int largerVal = selArr[i];
  // // 19. move the smaller value at higherIndex to lowerIndex
  // selArr[i] = selArr[min];
  // // 20. move the larger value to the higherIndex
  // selArr[min] = largerVal;
  // }
}