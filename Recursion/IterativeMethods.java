import java.util.*;

public class IterativeMethods {
 public static void main(String[] args) {
  goodMorning();
  System.out.println();
  goodAfternoon(0);
 }

 public static void goodMorning() {
  for (int i = 0; i <= 3; i++) {
   System.out.print(i);
  }
 }
 // 0123
 // 0123

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