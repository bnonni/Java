class Node {
 Object item;
 Node next;
 Node prev;

 Node(Object newItem) {
  item = newItem;
  next = null;
 }

 Node(Object newItem, Node nextNode, Node prevNode) {
  item = newItem;
  next = nextNode;
  prev = prevNode;
 }

}