import java.util.*;

public class TreeSetClient {
 public static void main(String[] args) {
  Set<String> set1 = new TreeSet<String>();
  set1.add("ted");
  set1.add("kim");
  set1.add("larry");
  set1.add("john");
  set1.add("kim");// not unique
  set1.add("john");// not unique
  System.out.println(set1.size()); // 4
 }
}