public class LinkList{ 
 Node head; 
 public class Node { 
   public Object item; 
   public Node next;

   Node(){
     item = null;
     next = null;
   }
   Node(Object n, Node p){
     item = n;
     next = p;
   }
 }
 static class Object{
   String str;
   Integer num;
   Object(Integer n){
     num = n;
   }
   Object(String s){
     str = s;
   }
 }
 public LinkList insert(LinkList list, Object obj){
   Node a_node = new Node();
   a_node.item = obj;
   a_node.next = null;
   
   if(head == null){
     list.head = a_node;
   }else{
     Node last = list.head;
     while(last.next != null){
       last = last.next;
     }
     last.next = a_node;
   }
   return list;
 }
public int traverse_print_size(Node n){  
   if(n == null){
    return 0;
   }else{
    if(n.item.str instanceof String){
      System.out.print(n.item.str + " ");
    }else if(n.item.num instanceof Integer){
      System.out.print(n.item.num + " ");
    }
    return traverse_print_size(n.next) + 1;
   }
  }
  public int size(Node n){  
    if(n == null){
     return 0;
    }else{
     return size(n.next) + 1;
    }
   }
  public void delete_head(){
    if(head == null) return;
    else{
      head = head.next;
    }
  }
  public void delete_int(Node n, LinkList list){
    Node curr = list.head;
      if(curr.item.str instanceof String){
        Object temp = curr.item;
        curr.next.item = temp;
        head = head.next;
      }else if(curr.item.num instanceof Integer){
        Object temp = curr.item;
        curr.next.item = temp;
        head = head.next;
      }
  }
  public void delete_last(Node curr, LinkList list){
    int len = list.size(list.head);
    int i;
    for(i = 0; i < len - 2; i++){
      curr = curr.next;      
    }
    curr.next = curr.next.next;
  }
 public static void main(String[] args) {
   LinkList list = new LinkList();
   for(int i = 0; i < 6; i++){
     Integer r = (int) (Math.random() * 100 - 1);
     String[] arr = {"CSC", "Data", "Lists", "Java", "Lab", "Seven"};
     Object n = new Object(new Integer(r));
     Object s = new Object(arr[i]);
     list.insert(list, n);
     list.insert(list, s);
   }
  System.out.println("\nLinked List Size: " + list.traverse_print_size(list.head) + "\n");
  list.delete_head();
  System.out.println("\nLinked List Size: " + list.traverse_print_size(list.head) + "\n");
  list.delete_int(list.head, list);
  System.out.println("\nLinked List Size: " + list.traverse_print_size(list.head) + "\n");
  list.delete_last(list.head, list);
  System.out.println("\nLinked List Size: " + list.traverse_print_size(list.head) + "\n");
 }
}