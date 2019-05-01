public class GraphQueue implements GraphQueueInterface {
 public Node last;
 public Node next;

 public GraphQueue() {
  last = null;
 }

 @Override
 public boolean isEmpty() {
  return last == null;
 }

 public void print() {
  Node curr = last.next;
  while (curr != last) {
   System.out.print(curr.item);
   curr = curr.next;
  }
  System.out.print(last.item);
 }

 public void dequeueAll() {
  while (!isEmpty()) {
   System.out.print(dequeue());
  }
  last = null;
 }

 @Override
 public void enqueue(Integer new_item) throws GraphQueueException {
  Node new_node = new Node(new_item);
  if (isEmpty()) {
   new_node.next = new_node;
  } else {
   new_node.next = last.next;
   last.next = new_node;
  }
  last = new_node;
 }

 @Override
 public Integer dequeue() throws GraphQueueException {
  if (!isEmpty()) {
   Node first = last.next;
   if (first == last) {
    last = null;
   } else {
    last.next = first.next;
   }
   return first.item;
  } else {
   throw new GraphQueueException("QueueException on dequeue: queue empty.");
  }
 }
}