import java.util.Vector;
import java.util.TreeMap;

class Graph {
 private int num_verticies;
 private int num_edges;

 private Vector<TreeMap<Integer, Integer>> adj_list;

 public Graph(int n) {
  num_verticies = n;
  num_edges = 0;
  adj_list = new Vector<TreeMap<Integer, Integer>>();
  for (int i = 0; i < num_verticies; i++) {
   adj_list.add(new TreeMap<Integer, Integer>());
  }
 }

 public int getNumberVertices() {
  return num_verticies;
 }

 public int getNumberEdges() {
  return num_edges;
 }

 public int getEdgeWeight(Integer v, Integer w) {
  return adj_list.get(v).get(w);
 }

 public void addEdge(Integer v, Integer w, int wgt) {
  adj_list.get(v).put(w, wgt);
  adj_list.get(w).put(v, wgt);
  num_edges++;
 }

 public void addEdge(Edge e) {
  Integer v = e.getV();
  Integer w = e.getW();
  int weight = e.getWeight();
  addEdge(v, w, weight);
 }

 public void removeEdge(Edge e) {
  Integer v = e.getV();
  Integer w = e.getW();
  adj_list.get(v).remove(w);
  adj_list.get(w).remove(v);
  num_edges--;
 }

 public Edge findEdge(Integer v, Integer w) {
  int wgt = adj_list.get(v).get(w);
  return new Edge(v, w, wgt);
 }

 TreeMap<Integer, Integer> getAdjList(Integer v) {
  return adj_list.get(v);
 }
}
