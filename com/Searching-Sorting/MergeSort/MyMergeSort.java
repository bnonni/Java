
import java.util.*;

public class MyMergeSort {
 public static void main(String[] args) {
  int[] a = { 4, 2, 3, 1 };
  mergeSort(a);
  for (int x : a) {
   System.out.print(x);
  }
 }

 public static void mergeSort(int[] a) {
  if (a.length > 1) { // 2 > 1

   // split array into two smaller arrays
   int size1 = a.length / 2; // 2
   int size2 = a.length - size1; // 4 - 2 = 2

   int[] half1 = Arrays.copyOfRange(a, 0, a.length / 2);
   int[] half2 = Arrays.copyOfRange(a, a.length / 2, a.length);

   System.out.print("half1=" + Arrays.toString(half1) + " half2=" + Arrays.toString(half2) + "\n");
   mergeSort(half1);
   mergeSort(half2);

   System.out.print("a=" + Arrays.toString(a) + "\n");
   merge(a, half1, half2);

   System.out.print("a=" + Arrays.toString(a) + "\n");
  }
 }

 public static void merge(int[] result, int[] list1, int[] list2) {
  int i1 = 0;
  int i2 = 0;
  for (int i = 0; i < result.length; i++) {
   if (i2 >= list2.length || (i1 < list1.length && list1[i1] < (list2[i2]))) {
    result[i] = list1[i1];
    i1++;
   } else {
    result[i] = list2[i2];
    i2++;
   }
  }
 }

}