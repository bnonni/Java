public class EnterMatrix {
 public static void main(String args[]) {
  System.out.println("Taking red pill... ");
  Graph graph = new Graph(10);
  GraphQueue graph_queue = new GraphQueue();
  boolean[] visit = new boolean[10];
  boolean[] mark = new boolean[10];
  int root = 0;
  int child = 4;
  Node r = new Node(root);

  graph.createGraph(root, child);
  System.out.println("Printing Adjacenecy Matrix: ");
  graph.printGraph();
  System.out.print("\n");
  graph.DFSutil(graph, root, child, visit);
  System.out.println("\n");
  graph.breadthFirstSearch(graph_queue, r, root, mark);

 }
}
