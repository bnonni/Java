import java.util.*;

public class SetClient {
 public static void main(String[] args) {
  Set<String> set1 = new HashSet<String>();
  set1.add("larry");
  set1.add("john");
  set1.add("kim");
  set1.add("john"); // this one gets skipped because sets CANNOT have duplicates
  set1.add("betty");
  System.out.println(set1.size());
 }
}