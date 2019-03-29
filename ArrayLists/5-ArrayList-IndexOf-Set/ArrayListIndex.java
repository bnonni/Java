import java.util.*;

public class ArrayListIndex {
 public static void main(String[] args) {
  ArrayList<String> list = new ArrayList<String>();
  list.add("a");
  list.add("e");
  list.add("c");
  list.add("b");
  String target = "a", newValue = "x";
  int myIndex = list.indexOf(target);
  list.set(myIndex, newValue);
  System.out.println(list.get(list.size() - 4));
 }
}
