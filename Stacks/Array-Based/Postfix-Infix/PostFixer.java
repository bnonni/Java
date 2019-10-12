/* 
Write a Java program which converts an infix expression to equivalent postfix expression. 
Your expression must consist of: operands, operators and parentheses. 
You need to be careful about the priority of operators. 
Use stack data structure to implement this program.
*/
public class PostFixer {
 public static void main(String[] args) {
  // String infixExp1 = "a-(b+c*d)/e";
  // String infixExp2 = "a+((b*c)-d)/e";
  // String infixExp3 = "((a+b)*c)/d";
  // String infixExp4 = "(a/b)*c+d-e";
  String infixExp5 = "a+b*(c-d)/(e*f)";
  // System.out.println(convertInfix(infixExp1));
  // System.out.println(convertInfix(infixExp2));
  // System.out.println(convertInfix(infixExp3));
  // System.out.println(convertInfix(infixExp4));
  System.out.println(convertInfix(infixExp5));
 }

 public static String convertInfix(String in) {
  String postfixExp = "";
  int length = in.length();
  Character[] infixArr = new Character[length];
  PostFixStack<Character> stack = new PostFixStack<Character>(length);
  for (int i = 0; i < length; i++) {
   infixArr[i] = in.charAt(i);
  }
  for (Character c : infixArr) {
   switch (c) {
   case 'a':
   case 'b':
   case 'c':
   case 'd':
   case 'e':
   case 'f':
    postfixExp = postfixExp + c;
    break;
   case '(':
    stack.push(c);
    break;
   case ')':
    while (stack.peek() != '(') {
     postfixExp = postfixExp + stack.pop();
    }
    Character parentheses = stack.pop();
    break;
   case '+':
   case '-':
   case '*':
   case '/':
    while ((!stack.isEmpty()) && (stack.peek() != '(') && (order(c) <= order(stack.peek()))) {
     postfixExp = postfixExp + stack.pop();
    }
    stack.push(c);
    break;
   }
  }
  while (!stack.isEmpty()) {
   postfixExp = postfixExp + stack.pop();
  }
  return postfixExp;
 }

 public static Integer order(Character c) {
  switch (c) {
  case '+':
  case '-':
   return 1;

  case '*':
  case '/':
   return 2;

  case '^':
   return 3;
  }
  return -1;
 }
}
