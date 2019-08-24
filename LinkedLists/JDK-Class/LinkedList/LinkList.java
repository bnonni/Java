import java.util.LinkedList;

public class LinkList {
 static class Object {
  Object obj;

  Object(Object o) {
   obj = o;
  }
 }

 public static void main(String[] args) {
  LinkedList list = new LinkedList();
  for (int i = 0; i < 5; i++) {
   Integer r = (int) (Math.random() * 100 - 1);
   list.add(r);
   String[] arr = { "String", "Algorithm", "Integer", "Object", "Data" };
   list.add(arr[i]);
  }
  System.out.println("\nFull List: " + list.toString() + "\nSize: " + list.size() + "\n");
  list.removeFirst();
  System.out.println("\nList (delete head): " + list.toString() + "\nSize: " + list.size() + "\n");
  list.remove(2);
  System.out.println("\nList (delete 3rd node): " + list.toString() + "\nSize: " + list.size() + "\n");
  list.removeLast();
  System.out.println("\nList (delete last node): " + list.toString() + "\nSize: " + list.size() + "\n");
 }
}