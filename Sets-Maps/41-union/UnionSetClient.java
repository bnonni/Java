import java.util.HashSet;
import java.util.Set;

public class UnionSetClient {
 public static int total(Set<String> set1, Set<String> set2) {
  Set<String> union = new HashSet<String>(set1);
  union.addAll(set2);
  System.out.println(union);
  return (union.size());
 }

 public static void main(String[] args) {
  Set<String> set1 = new HashSet<String>();
  set1.add("ted");
  set1.add("kim");
  set1.add("larry");
  set1.add("john");
  set1.add("kim");
  set1.add("john");
  Set<String> set2 = new HashSet<String>();
  set2.add("cat");
  set2.add("dog");
  set2.add("fish");
  set2.add("cat");
  set2.add("dog");
  set2.add("bird");
  System.out.println(total(set1, set2));
 }
}