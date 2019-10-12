public class Edge implements Comparable<Edge> {
 Integer v;
 Integer u;
 Integer wgt;

 public Edge(int v, int u, int wgt) {
  this.v = v;
  this.u = u;
  this.wgt = wgt;
 }

 public String toString() {
  return "(" + v + "--" + u + ", " + wgt + ")";
 }

 public int compareTo(Edge other) {
  return this.wgt.compareTo(other.wgt);
 }
}
