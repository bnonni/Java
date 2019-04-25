import java.util.Iterator;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Set;
import java.util.NoSuchElementException;

class BFSIterator implements Iterator<Integer> {
 private Graph g;
 private int num_vertices;
 private int count;
 private int[] mark;
 private int iter;

 public BFSIterator(Graph g) {
  this.g = g;
  num_vertices = g.getNumberVertices();
  mark = new int[num_vertices];
  Arrays.fill(mark, 0, num_vertices, -1);

  count = 0;
  iter = -1;
  startSearch();
 }

 public boolean hasNext() {
  return (iter >= 0) && (iter < num_vertices);
 }

 public Integer next() throws NoSuchElementException {
  if (hasNext()) {
   return mark[iter++];
  } else {
   throw new NoSuchElementException();
  }
 }

 public void remove() {
  throw new UnsupportedOperationException();
 }

 protected void startSearch() {
  for (int v = 0; v < num_vertices; v++) {
   if (mark[v] == -1) {
    search(v);
   }
  }
  iter = 0;
 }

 protected void search(Integer vertex) {
  LinkedList<Integer> q = new LinkedList<Integer>();
  TreeMap<Integer, Integer> m;
  Set<Integer> connected_vertices;
  Integer v;

  q.add(vertex);

  while (!q.isEmpty()) {
   v = q.remove();
   if (mark[v] == -1) {
    mark[v] = count++;

    m = g.getAdjList(v);
    connected_vertices = m.keySet();
    for (Integer w : connected_vertices) {
     if (mark[w] == -1) {
      q.add(w);
     }
    }
   }
  }
 }
}
