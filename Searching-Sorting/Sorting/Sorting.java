
public class Sorting {
 public static int[] arr;
 public static int r;

 public static void main(String[] args) {

  try {
   for (int i = 0; i < 100; i++) {
    // 7. Use Math class to create 100 random ints between 0 - 99
    r = (int) (Math.random() * 100 - 1);
    // 8. store random ints in array arr
    arr[i] = r;
   }
  } catch (Exception e) {
   System.out.println(e);
   BubbleSort b = new BubbleSort();
   SelectionSort s = new SelectionSort();
   MergeSort m = new MergeSort();
   b.bubbleSort();
   s.selectionSort();
   m.mergeSort();
  }
 }
}