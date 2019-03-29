import java.util.Iterator;
import java.util.LinkedList;

public class Collection {
 public static void main(String[] args) {
  LinkedList<String> words = new LinkedList<String>();
  words.add("hello");
  words.add("goodby");
  words.add("day");
  words.add("noon");
  // System.out.println(words.size());

  mystery(words); // line x
  System.out.println(words); // line y

  // System.out.println(mystery2(words)); // line u
 }

 // words = hello, day
 public static void mystery(LinkedList<String> words) {
  Iterator<String> i = words.iterator();
  while (i.hasNext()) {
   String element = i.next();
   if (element.length() % 2 == 0) {
    i.remove();
   }
  }
 }

 public static String mystery2(LinkedList<String> words) {
  Iterator<String> i = words.iterator();
  String result = i.next();
  while (i.hasNext()) {
   String next = i.next();
   if (next.length() > result.length()) {
    result = next;
   }
  }
  return result;
 }

}