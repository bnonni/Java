import java.util.ArrayList;

public interface WeightedGraphInterface {

 public void createWeightedGraph();

 public void printGraph();

 public Integer getEdgeWeight(Integer v, Integer w);

 public void addEdge(Integer v, Integer w, int wg) throws WeightedGraphException;

 public ArrayList<Integer> breadthFirstSearch(int first_v);

 public ArrayList<Integer> findAdjacentVerticies(int vert);

 public void PrimsAlgorithm(int s);

 public class WeightedGraphException extends RuntimeException {
  public WeightedGraphException(String s) {
   super(s);
  }
 }

}