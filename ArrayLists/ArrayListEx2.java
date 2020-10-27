import java.util.*;

public class ArrayListEx2 {
 public static void main(String[] args) {
  ArrayList<Integer> list3 = new ArrayList<Integer>();
  list3.add(6);
  list3.add(1);
  list3.add(4);
  list3.add(5);
  Collections.sort(list3);
  System.out.println(list3.get(1));
 }
}