import java.util.Arrays;
// Java program for implementation of QuickSort 
class QuickSort {
 public static void main(String args[]) {
  int[] arr = new int[10];

    // 6. use for loop to generate 100 random ints
    for (int i = 0; i < 10; i++) {
      // 7. Use Math class to create 100 random ints between 0 - 99
      int r = (int) (Math.random() * 100 - 1);
      // 8. store random ints in array arr
      arr[i] = r;
    }
  System.out.println("Unsorted array" + Arrays.toString(arr));
  int n = arr.length;

  QuickSort qs = new QuickSort();
  qs.sort(arr, 0, n - 1);

  System.out.println("Sorted array " + Arrays.toString(arr));
 }

 void sort(int arr[], int low, int high) {
  System.out.println("low " +low+" high "+high);
  if (low < high) {
   /*
    * pi is partitioning index, arr[pi] is now at right place
    */
   int p = partition(arr, low, high);
   System.out.println("p: " + p + ", " + "arr[p]: " + arr[p]);

   // Recursively sort elements before
   // partition and after partition
   sort(arr, low, p - 1);
   sort(arr, p + 1, high);
   
  }
 }

 int partition(int arr[], int low, int high) {
  int pivot = arr[high];
  int i = (low - 1);
  System.out.println("i " + i);
   // index of smaller element
  for (int j = low; j < high; j++) {
   System.out.println("j " + j);
   // If current element is smaller than or
   // equal to pivot
   if (arr[j] <= pivot) {
    i++;
    System.out.println("i " + i);
    

    // swap arr[i] and arr[j]
    int temp = arr[i];
    System.out.println("Before: temp " + temp + " arr["+i+"] " + arr[i] + " arr["+j+"] " +arr[j]);
    arr[i] = arr[j];
    arr[j] = temp;
    System.out.println("After: temp " + temp + " arr["+i+"] " + arr[i] + " arr["+j+"] " +arr[j]);
    System.out.println(Arrays.toString(arr));
    
   }
  }

  // swap arr[i+1] and arr[high] (or pivot)
  int temp = arr[i + 1];
  arr[i + 1] = arr[high];
  arr[high] = temp;

  return i + 1;
 }
}
