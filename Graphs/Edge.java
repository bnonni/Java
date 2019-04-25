class Edge {
 private Integer v, w;
 private int weight;

 public Edge(Integer first, Integer second, int edge_weight) {
  this.v = first;
  this.w = second;
  this.weight = edge_weight;
 }

 public int getWeight() {
  return weight;
 }

 public Integer getV() {
  return v;
 }

 public Integer getW() {
  return w;
 }
}
