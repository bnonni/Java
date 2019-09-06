
public class GraphStack implements GraphStackInterface {
 Node top;

 public GraphStack() {
  top = null;
 }

 @Override
 public boolean isEmpty() {
  return top == null;
 }

 @Override
 public void push(Integer new_item) {
  top = new Node(new_item, top);
 }

 public Integer pop() throws GraphStackException {
  if (!isEmpty()) {
   Node temp = top;
   top = top.next;
   return temp.item;
  } else {
   throw new GraphStackException("Stack Exception on pop: stack empty");
  }
 }

 @Override
 public void popAll() {
  top = null;
 }

 @Override
 public Integer peek() throws GraphStackException {
  if (!isEmpty()) {
   return top.item;
  } else {
   throw new GraphStackException("Stack Exception on peek - stack empty");
  }
 }
}