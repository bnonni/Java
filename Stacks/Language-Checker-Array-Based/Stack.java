public class Stack<E> implements StackInterface {
 private Integer STACK_CAPACITY;
 private Character arr[];
 private Integer top;

 public Stack(Integer size) {
  arr = new Character[size];
  STACK_CAPACITY = size;
  top = -1;
 }

 @Override
 public Boolean isEmpty() {
  return top < 0;
 }

 @Override
 public Boolean isFull() {
  return top == STACK_CAPACITY - 1;
 }

 @Override
 public void push(Character ch) throws StackException {
  if (!isFull()) {
   arr[++top] = ch;
  } else {
   throw new StackException("StackException on push: stack full");
  }
 }

 @Override
 public Character pop() throws StackException {
  if (!isEmpty()) {
   return arr[top--];
  } else {
   throw new StackException("Stack Exception on pop: stack empty");
  }
 }

 @Override
 public Character peek() throws StackException {
  if (!isEmpty()) {
   return arr[top];
  } else {
   throw new StackException("Stack Exception on peek - stack empty");
  }
 }

 @Override
 public Integer size() {
  return top + 1;
 }

 @Override
 public void popAll() {
  arr = new Character[STACK_CAPACITY];
  top = -1;
 }
}