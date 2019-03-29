import java.util.*;

public class LinkedListClient {
 public static void main(String[] arg) {
  LinkedList<String> list = new LinkedList<String>();
  list.add("hello");
  list.add("up");
  list.add("cat");
  System.out.println(Collections.min(list)); // line a
  System.out.println(Collections.max(list)); // line b
  Collections.sort(list);
  System.out.println(list); // line c
  Collections.reverse(list);
  System.out.println(list); // line d
  System.out.println(list.get(1)); // line e
 }
}