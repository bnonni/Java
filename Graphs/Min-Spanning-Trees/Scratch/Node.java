class Node extends GraphStack {
 Integer item;
 Node next;
 
 Node(Integer new_item) {
  item = new_item;
  next = null;
 }

 Node(Integer new_item, Node next_node) {
  item = new_item;
  next = next_node;
 }
}