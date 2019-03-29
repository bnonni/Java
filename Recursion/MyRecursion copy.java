import java.util.*;

public class MyRecursion {
 public static void main(String[] args) {
  goodAfternoon(0);
 }

 public static void goodAfternoon(int i) {
  if (i >= 3) {
   System.out.print(i);
  } else {
   System.out.print(i);
   i++;
   goodAfternoon(i);
  }
 }
}