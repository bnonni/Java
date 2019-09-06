import java.util.ArrayList;

public class EnterMatrix {
 public static void main(String[] args) {
  int n = 10;
  int span_1 = 0;
  int span_2 = 9;
  // ArrayList<Integer> span_tree_1 = new ArrayList<Integer>();
  // ArrayList<Integer> span_tree_2 = new ArrayList<Integer>();

  WeightedGraph wg = new WeightedGraph(n);
  wg.createWeightedGraph();

  System.out.print("\nSpanning Tree #1\n");
  System.out.println(wg.breadthFirstSearch(span_1));

  System.out.print("\nSpanning Tree #2\n");
  System.out.println(wg.breadthFirstSearch(span_2));

  wg.PrimsAlgorithm(span_1);
 }
}
