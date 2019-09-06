import java.util.Iterator;
import java.util.LinkedList;

public class Ch11_collection {
 public static void main(String[] args) {
  LinkedList<String> words = new LinkedList<String>();
  words.add("hello");
  words.add("goodby");
  words.add("day");
  words.add("noon");
  mystery(words); // line x
  System.out.print(words.get(0)); // line y
  System.out.print(words.get(1)); // line y
 }

 public static void mystery(LinkedList<String> words) {
  Iterator<String> i = words.iterator();
  while (i.hasNext()) {
   String element = i.next();
   if (element.length() % 2 == 0) {
    i.remove();
   }
  }
 }
}