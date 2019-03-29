import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListClient {
 public static void main(String[] args) {
  List<Integer> list1 = new LinkedList<Integer>();
  list1.add(5);
  list1.add(3);
  list1.add(6);
  list1.add(2);
  list1.add(4);
  mystery2(list1);
 }

 public static void mystery2(List<Integer> list) {
  Set<Integer> result = new TreeSet<Integer>();
  for (Integer element : list) {
   if (element.compareTo(list.get(0)) < 0) { // compareTo returns a neg number if false, pos if true
    result.add(element);
   } else {
    result.clear();
   }
  }
  System.out.println(result.size()); // 2
 }
}
