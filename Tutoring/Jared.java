import java.util.*;

public class Jared {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  // read input number (which will be between 2 and 1000)
  int number = Integer.parseInt(sc.nextLine());

  NewO obj = new NewO();
  int[] primes = obj.factorize(number);
  System.out.println(Arrays.toString(primes));

 }

}