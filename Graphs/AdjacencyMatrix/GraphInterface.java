public interface GraphInterface {
 public void addEdge(int source, int destination) throws GraphException;

 public void printGraph();

 public void DFSutil(Graph g, int r_util, int c_util, boolean[] visit);

 public void depthFirstSearch(Graph g, int r, int c, boolean[] visit);

 public void breadthFirstSearch(GraphQueue gq, Node last, int root, boolean[] mark);
}