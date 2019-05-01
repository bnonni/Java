import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

/*
author: Bryan Nonni
date: April 19, 2019
program: adjacency matrix, weighted graph; 2 spanning trees + tree weights; Prim's Algorithm
  ______________________________
~| 0  1  2  3  4  5  6  7  8  9 |
0| 0  0  0  0  1  0  3  0  0  0 |
1| 0  0  2  0  4  0  0  0  0  0 |
2| 0  2  0  0  0  0 10  0  0  0 |
3| 0  0  0  0  0  0  8  0  4  0 |
4| 1  4  0  0  0  0  0  0  0  0 | 
5| 0  0  0  0  0  0  0  2  0  2 |
6| 3  0 10  8  0  0  0  5  0  0 |
7| 0  0  0  0  0  2  5  0  7  0 |
8| 0  0  0  4  0  0  0  7  0  0 |
9| 0  0  0  0  0  2  0  0  0  0 |
~|______________________________|
*/
public class WeightedGraph implements WeightedGraphInterface {
  private int number_vertices;
  private int number_edges;
  private Integer adjacency_matrix[][];

  public WeightedGraph(int n) {
    this.number_vertices = n;
    this.number_edges = 0;
    this.adjacency_matrix = new Integer[number_vertices][number_vertices];
    System.out.print("\nCreating weighted graph. Please wait...\n");
    createWeightedGraph();
    printGraph();
  }

  public void createWeightedGraph() {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {

    } finally {
      addEdge(0, 4, 1);
      addEdge(0, 6, 3);
      addEdge(4, 1, 4);
      addEdge(1, 2, 2);
      addEdge(6, 2, 10);
      addEdge(6, 3, 8);
      addEdge(6, 7, 5);
      addEdge(3, 8, 4);
      addEdge(7, 8, 7);
      addEdge(7, 5, 2);
      addEdge(5, 9, 2);
    }
  }

  public void printGraph() {
    System.out.print("\n");
    for (int i = 0; i < number_vertices; i++) {
      for (int j = 0; j < number_vertices; j++) {
        if (adjacency_matrix[i][j] == null) {
          System.out.print("\u221E ");
        } else {
          System.out.print(adjacency_matrix[i][j] + " ");
        }
        if (j == 9) {
          System.out.print("\n");
        }
      }
    }
  }

  public Integer getEdgeWeight(Integer v, Integer w) {
    return adjacency_matrix[v][w];
  }

  public void addEdge(Integer v, Integer w, int wgt) throws WeightedGraphException {
    adjacency_matrix[v][w] = wgt;
    adjacency_matrix[w][v] = wgt;
  }

  public ArrayList<Integer> breadthFirstSearch(int first_vert) {
    ArrayList<Integer> bfs_list = new ArrayList<Integer>();
    boolean[] visited = new boolean[number_vertices];
    LinkedList<Integer> queue = new LinkedList<Integer>();
    int weight = 0;
    queue.add(first_vert);
    visited[first_vert] = true;
    while (!queue.isEmpty()) {
      Integer curr = queue.remove(); // 4
      bfs_list.add(curr);
      for (Integer i : findAdjacentVerticies(curr)) {
        if (!visited[i]) {
          queue.add(i);
          visited[i] = true;
          if (getEdgeWeight(curr, i) != null) {
            weight += getEdgeWeight(curr, i);
          }
        }
      }
    }
    System.out.println("Weight: " + weight);
    return bfs_list;
  }

  public ArrayList<Integer> findAdjacentVerticies(int vertex) {
    ArrayList<Integer> adjacents = new ArrayList<Integer>();
    for (int i = 0; i < number_vertices; i++) {
      if (getEdgeWeight(vertex, i) != null) {
        adjacents.add(i);
      }
    }
    return adjacents;
  }

  public void PrimsAlgorithm(int source) {
    ArrayList<Edge> min_span_tree = new ArrayList<Edge>();
    boolean[] visited = new boolean[number_vertices];
    int min_span_tree_wgt = 0;
    PriorityQueue<Edge> queue = new PriorityQueue<Edge>();
    visited[0] = true;

    for (int i : findAdjacentVerticies(0)) {
      queue.add(new Edge(0, i, getEdgeWeight(0, i)));
    }

    while (!queue.isEmpty()) {
      Edge edge = queue.remove();
      int v1 = edge.v;
      int v2 = edge.u;
      int wgt = edge.wgt;
      if (!(visited[v1] && visited[v2])) {
        int newVert = (visited[v1]) ? v2 : v1;
        visited[newVert] = true;
        min_span_tree_wgt += wgt;
        min_span_tree.add(edge);
        for (int i : findAdjacentVerticies(newVert)) {
          if (!visited[i]) {
            queue.add(new Edge(newVert, i, getEdgeWeight(newVert, i)));
          }
        }
      }
    }
    System.out.println("\nMST - Prim's Algorithm");
    System.out.println("Minimum Spanning Tree: " + min_span_tree);
    System.out.println("Weight: " + min_span_tree_wgt + "\n");
  }
}