import java.util.HashMap;
import java.util.Map;

public class MapClient {
 public static void main(String[] args) {
  Map<String, Integer> map1 = new HashMap<String, Integer>();
  map1.put("ted", 100);
  map1.put("kim", 200);
  map1.put("larry", 300);
  String key2 = "ted";
  if (map1.containsKey(key2))
   System.out.print(map1.get(key2));
  else
   System.out.print(0);
  System.out.print(":");
  String key = "Kim";
  if (map1.containsKey(key))
   System.out.print(map1.get(key));
  else
   System.out.print(0);
 }
}