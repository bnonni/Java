import java.util.*;

public class ArrayListMain {
 public static void main(String[] args) {
  ArrayList<Integer> list2 = new ArrayList<Integer>();
  mystery(list2);
  System.out.println(list2.get(2));
 }

 public static void mystery(ArrayList<Integer> list) {
  for (int i = 6; i <= 10; i++) {
   list.add(i);
  }
 }
}
