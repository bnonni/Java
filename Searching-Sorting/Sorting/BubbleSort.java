//Bryan Nonni
//CSC 2720 Lab 4
//02-08-2019
//Bubble Sort

// 1. import utilities
import java.util.Arrays;

// 2. decalre SelectionSort class
public class BubbleSort {
  // 3. declare main method
  public void bubbleSort() {
    // 4. capture program starttime
    long bubbleStart = System.nanoTime();

    int[] arr = new int[100];

    // 6. use for loop to generate 100 random ints
    for (var i = 0; i < 100; i++) {
      // 7. Use Math class to create 100 random ints between 0 - 99
      int r = (int) (Math.random() * 100 - 1);
      // 8. store random ints in array arr
      arr[i] = r;
    }

    // 9. print unsorted array
    System.out.println("\nUnsorted arr = " + Arrays.toString(arr) + "\n________________");

    // 10. store arr length
    int l = arr.length;

    // 11. initiate selection of arr elements, pass arr and arr length
    bubble(arr, l);

    // 20. Print sorted array
    System.out.println("\nBubble Sort:\n\nSorted arr = " + Arrays.toString(arr));

    // 21. declare program end time var, calc runtime, print runtime
    long bubbleEnd = System.nanoTime();
    long nanoTime = bubbleEnd - bubbleStart;
    long milliTime = nanoTime / 1000000;
    System.out.println("\nThis bubble sort took: " + nanoTime + " nanoseconds.");
    System.out.println("\nThis bubble sort took: " + milliTime + " milliseconds.\n");
  }

  // 12. declare select method
  public void bubble(int[] bubArr, int len) {
    // 13. declare counters
    int i, j;
    // 14. outer loop sets initial index of comparison, iterating on entire array
    for (i = 0; i < len - 1; i++) {
      // 15. inner loop compares adjacent indexes, iterating on arr-1
      for (j = 0; j < len - i - 1; j++) {
        // 16. if value at initial index > next index, need to swap
        if (bubArr[j] > bubArr[j + 1]) {
          // 17. store the larger value
          int largerVal = bubArr[j];
          // 18. set smaller value to index of larger value
          bubArr[j] = bubArr[j + 1];
          // 19. set larger value index to larger value
          bubArr[j + 1] = largerVal;
        }
      }
    }
  }
}
