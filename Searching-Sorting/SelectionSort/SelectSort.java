import java.util.*;

public class SelectSort {
 public static void main(String[] args) {
  List<Integer> numbers = new ArrayList<Integer>(2, 4, 1, 5, 3);
  Arrays.sort(numbers);
  System.out.print(numbers.toString());
 }
}