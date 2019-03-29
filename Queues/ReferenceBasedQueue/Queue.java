public class Queue implements QueueInterface {
 public Node last;

 public Queue() {
  last = null;
 }

 @Override
 public boolean isEmpty() {
  return last == null;
 }

 @Override
 public void dequeueAll() {
  System.out.println("\nDequeue All:\n");
  while (!isEmpty()) {
   System.out.print(dequeue());
  }
  last = null;
  System.out.println("\nQueue is now empty.\n");
 }

 @Override
 public void enqueue(Object newItem) {
  Node newNode = new Node(newItem);
  if (isEmpty()) {
   newNode.next = newNode;
  } else {
   newNode.next = last.next;
   last.next = newNode;
  }
  last = newNode;
 }

 public void print() {
  Node curr = last.next;
  while (curr != last) {
   System.out.print(curr.item);
   curr = curr.next;
  }
  System.out.print(last.item);
 }

 @Override
 public Object dequeue() throws QueueException {
  if (!isEmpty()) {
   Node first = last.next;
   if (first == last) {
    last = null;
   } else {
    last.next = first.next;
   }
   return first.item;
  } else {
   throw new QueueException("QueueException on dequeue: queue empty.");
  }
 }

 @Override
 public Object peek() throws QueueException {
  if (!isEmpty()) {
   Node first = last.next;
   return first.next.item;
  } else {
   throw new QueueException("QueueException on peek: queue empty.");
  }
 }
}