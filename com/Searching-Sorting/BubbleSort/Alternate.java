import java.util.Arrays;

public class Alternate {
 public static void main(String[] args) {
  int[] arr = new int[100];

  // 6. use for loop to generate 100 random ints
  for (int i = 0; i <= 99; i++) {
   // 7. Use Math class to create 100 random ints between 0 - 99
   int r = (int) (Math.random() * 100 - 1);
   // 8. store random ints in array arr
   arr[i] = r;
  }
  System.out.println("Unsorted arr " + Arrays.toString(arr));
  Alternate bub = new Alternate();
  bub.bubbleSort(arr);
  System.out.println("Sorted arr: " + Arrays.toString(arr));
 }

 public void bubbleSort(int[] arr) {
  int i = arr.length;
  boolean sorted = true;
  while (i > 1 && sorted) {
   sorted = false;
   for (int j = 1; j < i; j++) {
    if (arr[j - 1] > arr[j]) {
     int temp = arr[j - 1];
     arr[j - 1] = arr[j];
     arr[j] = temp;
     sorted = true;
    }
   }
   i--;
  }
 }
}