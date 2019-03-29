public class PostFixStack<E> implements PostFixStackInterface {
 private Integer STACK_CAPACITY;
 private Character arr[];
 private Integer top;

 public PostFixStack(Integer size) {
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
 public void push(Character c) throws PostFixStackException {
  if (!isFull()) {
   arr[++top] = c;
  } else {
   throw new PostFixStackException("StackException on push: stack full");
  }
 }

 @Override
 public Character pop() throws PostFixStackException {
  if (!isEmpty()) {
   return arr[top--];
  } else {
   throw new PostFixStackException("Stack Exception on pop: stack empty");
  }
 }

 @Override
 public Character peek() throws PostFixStackException {
  if (!isEmpty()) {
   return arr[top];
  } else {
   throw new PostFixStackException("Stack Exception on peek - stack empty");
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