import java.util.*;

public class NewO {
 ArrayList<Integer> PL = new ArrayList<Integer>();

 public boolean isPrime(int number) {
  if (number < 2) {
   return false;
  }

  for (int i = 2; i < number; i++) {
   if (number % i == 0) {
    return false;
   }
  }
  return true;
 }

 /*
  * Object[] array = list.toArray();
  * 
  * System.out.println( Arrays.toString(array) );
  * 
  * //Iterate and convert to desired type for(Object o : array) { String s =
  * (String) o;
  * 
  * System.out.println(s); }
  */

 public int[] factorize(int number) {
  System.out.println(number);
  int n = PL.size();
  int[] result = new int[n];

  if (isPrime(number)) {
   PL.add(number);
  } else {
   int value = 2;
   boolean answer = false;
   while (!answer) {
    if (number % value == 0) {
     System.out.println(Arrays.toString(factorize(value)));
     System.out.println(Arrays.toString(factorize(number / value)));
     System.exit(0);
     answer = true;
    } else {
     value++;
    }
   }
  }
  return result;
 }
}