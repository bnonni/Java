package ArrayLists;
import java.util.*;

public class ArrayListEx3 {
 public static void main(String[] args) {
  ArrayList<Integer> list3 = new ArrayList<Integer>();
  list3.add(2);
  list3.add(3);
  list3.add(4);
  list3.add(5);
  int sum = 0;
  for (Integer i : list3) {
   sum += i;
   System.out.println(i);
  }
  System.out.println(sum);
 }
}