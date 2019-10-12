import java.util.*;

public class ArrayListEx {
 public static void main(String[] args) {
  ArrayList<Integer> list3 = new ArrayList<Integer>();
  list3.add(2);
  list3.add(3);
  list3.add(4);
  list3.add(5);
  mystery3(list3);
 }

 public static void mystery3(ArrayList<Integer> list) {
  int sum = 0;
  for (Integer i : list) {
   if (i % 2 == 0) {
    sum += i;
   } else {
    sum -= i;
   }
  }
  System.out.println(sum);
 }
}