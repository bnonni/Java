import java.util.*;

public class ArrayListClient {
 public static void main(String[] args) {
  ArrayList<Integer> list = new ArrayList<Integer>();
  list.add(10);
  list.add(20);
  list.add(30);
  int num = list.get(0);
  mystery(list, num);
  System.out.println(list.get(2));
 }

 public static void mystery(ArrayList<Integer> list, int num) {
  for (int i = 0; i < list.size(); i++) {
   list.set(i, list.get(i) + num);
  }
 }
}

/*
 * 
 * list = 10, 20, 30; num = 10; list[0] = 10 + 10 = 20; list[1] = 20 + 10 = 30;
 * list[2] = 30 + 10 = 40;
 * 
 * list.get(2) = 40
 * 
 */