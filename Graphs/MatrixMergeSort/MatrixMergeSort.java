import java.lang.Math;

public class MatrixMergeSort {
 public static void main(String[] args) {
  int[][] matrix = { { 3, 10, 4 }, { 1, 1012, -18 }, { 3, -12, -101 }, { 67, 0, -23 }, { 3, 10, 5 } };
  int[] p = matrix[0];
  int[] r = matrix[4];
  MergeSort(matrix, p, r);
 }

 public static void MergeSort(int[][] A, int[] p, int[] r) {
  if (p.length < r.length) {
   int q[];
   MergeSort(A, p, q);
   MergeSort(A, q + 1, r);
   // Merge(A, p, q, r);
  }
 }
}
