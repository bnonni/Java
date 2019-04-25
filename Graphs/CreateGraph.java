import java.util.Arrays;
import java.util.Random;

public class CreateGraph {
 public static void main(String[] args) {
  Random random = new Random();
  // Edge edge;
  int random_int = random.nextInt(100);
  Graph graph = new Graph(random_int);

  graph.addEdge(0, 1, 10);
  graph.addEdge(0, 2, 20);
  graph.addEdge(0, 3, 30);
  graph.addEdge(2, 4, 42);
  graph.addEdge(1, 2, 21);
  graph.addEdge(2, 3, 32);
  BFSIterator bfs = new BFSIterator(graph);
 }
}