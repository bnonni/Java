
public class LanguageChecker {
 public static void main(String[] args) {
  String s1 = "ABC$CBA";
  String s2 = "AB$AB";
  String s3 = "A$A";
  String s4 = "ABC$ABC";
  String s5 = "racecar$racecar";
  String s6 = "bryannayrb";
  String s7 = "kayak$kayak";
  System.out.println(s1 + " in the language? " + TestL(s1));
  System.out.println(s2 + " in the language? " + TestL(s2));
  System.out.println(s3 + " in the language? " + TestL(s3));
  System.out.println(s4 + " in the language? " + TestL(s4));
  System.out.println(s5 + " in the language? " + TestL(s5));
  System.out.println(s6 + " in the language? " + TestL(s6));
  System.out.println(s7 + " in the language? " + TestL(s7));
 }

 public static Boolean TestL(String s) {
  String dollar_sign = "$";
  if (!s.contains(dollar_sign)) {
   return false;
  }
  int length = s.length();
  Stack<Character> stack = new Stack<Character>(length);
  for (int i = 0; i < length; i++) {
   stack.push(s.charAt(i));
  }
  for (int i = 0; i < length; i++) {
   char c = s.charAt(i);
   if (c != stack.pop()) {
    return false;
   }
  }
  return true;
 }
}