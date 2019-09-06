import java.util.*;
public class B_ArrayListMain { 
   public static void main(String[] args) { 
      ArrayList<String> list = new ArrayList<String>();
      list.add("ada");
      list.add("ted");
      list.add("mad");
      list.add("rot");
      list.add(1, "ele");
      list.add(2, "kin");
      list.remove(3);
      System.out.println(list.get(1)+"_"+list.get(3));
   }
}