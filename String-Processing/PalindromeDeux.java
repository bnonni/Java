
import java.util.Scanner;

public class PalindromeDeux {
 public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.print("Enter any word: ");
  String word = input.next();
  String reverseCheck = new StringBuffer(word).reverse().toString();

  if (word.equals(reverseCheck)) {
   System.out.println(word + " is a palindrome: " + reverseCheck);
  } else {
   System.out.println(word + " is not a palindrome: " + reverseCheck);
  }
  input.close();
 }
}
