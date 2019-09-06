public class Node extends GraphQueue {
 Integer item;
 Node next;
 Node prev;

 Node(Integer new_item) {
  item = new_item;
  next = null;
 }

 Node(Integer new_item, Node next_node, Node prev_node) {
  item = new_item;
  next = next_node;
  prev = prev_node;
 }
}