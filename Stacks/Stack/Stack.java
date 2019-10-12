public class Stack implements StackInterface {
 final int MAX_STACK = 5;
 private Integer arr[];
 private int top;

 public Stack() {
  arr = new Integer[MAX_STACK];
  top = -1;
 }

 @Override
 public boolean isEmpty() {
  return top < 0;
 }

 @Override
 public boolean isFull() {
  return top == MAX_STACK - 1;
 }

 @Override
 public void push(Integer newI) throws StackException {
  if (!isFull()) {
   arr[++top] = newI;
  } else {
   throw new StackException("StackException on push: stack full");
  }
 }

 @Override
 public void popAll() {
  arr = new Integer[MAX_STACK];
  top = -1;
 }

 @Override
 public Integer pop() throws StackException {
  if (!isEmpty()) {
   return arr[top--];
  } else {
   throw new StackException("Stack Exception on pop: stack empty");
  }
 }

 @Override
 public Integer peek() throws StackException {
  if (!isEmpty()) {
   return arr[top];
  } else {
   throw new StackException("Stack Exception on peek - stack empty");
  }
 }
}