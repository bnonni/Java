import java.util.*;

public class ArrayListMain {
 public static void main(String[] args) {
  ArrayList<String> list = new ArrayList<String>();
  list.add("a");
  list.add("e");
  list.add("c");
  list.add("b");
  list.add(2, "g");
  list.remove(1);
  System.out.println(list.get(2));
 }
}