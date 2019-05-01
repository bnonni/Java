/*
author: Bryan Nonni
date: April 12, 2019
program: adjeacency matrix graph, DFS, BFS
_____________________________
 | 0  1  2  3  4  5  6  7  8  9
0| 0  0  0  0  1  0  1  0  0  0 
1| 0  0  1  0  1  0  0  0  0  0
2| 0  1  0  0  0  0  1  0  0  0
3| 0  0  0  0  0  0  1  0  1  0
4| 1  1  0  0  0  0  0  0  0  0
5| 0  0  0  0  0  0  0  1  0  1
6| 1  0  1  1  0  0  0  1  0  0
7| 0  0  0  0  0  1  1  0  1  0
8| 0  0  0  1  0  0  0  1  0  0
9| 0  0  0  0  0  1  0  0  0  0 
_______________________________
DFS 0 --> 4 --> 1 --> 2 --> 6 --> 3 --> 8 --> 7 --> 5 --> 9
BFS 0 --> 6 --> 4 --> 7 --> 3 --> 2 --> 1 --> 8 --> 5 --> 9
*/

public class Graph extends GraphQueue implements GraphInterface {
   private Integer adj_matrix[][];
   private int size;
   private int vertex;
   GraphQueue g;

   public Graph(int v) {
      this.size = v;
      this.vertex = v;
      adj_matrix = new Integer[v][v];
   }

   public void addEdge(int source, int destination) throws GraphException {
      adj_matrix[source][destination] = 1;
      adj_matrix[destination][source] = 1;
   }

   public void createGraph(int root, int child) {
      addEdge(root, child);
      addEdge(0, 6);
      addEdge(1, 2);
      addEdge(1, 4);
      addEdge(2, 6);
      addEdge(3, 6);
      addEdge(3, 8);
      addEdge(5, 7);
      addEdge(5, 9);
      addEdge(6, 7);
      addEdge(7, 8);
   }

   public void printGraph() {
      for (int i = 0; i < size; i++) {
         for (int j = 0; j < size; j++) {
            if (adj_matrix[i][j] == null) {
               System.out.print(0 + " ");
            } else if (adj_matrix[i][j] != null) {
               System.out.print(adj_matrix[i][j] + " ");
            }
            if (j == 9) {
               System.out.print("\n");
            }
         }
      }
   }

   public void DFSutil(Graph g, int r_util, int c_util, boolean[] visited) {
      System.out.print(r_util + " " + c_util);
      visited[r_util] = true;
      visited[c_util] = true;
      r_util = c_util;
      c_util = 0;
      depthFirstSearch(g, r_util, c_util, visited);
   }

   public void depthFirstSearch(Graph g, int r, int c, boolean[] visited) {
      int n = size;
      int m = size;
      while (n >= 0) {
         if (!visited[r]) { // 0
            visited[r] = true;
            System.out.print(" " + r);
         } else if (visited[r]) {
            for (int i = c; i < m; i++) {
               if (adj_matrix[r][i] != null && !visited[i]) {
                  visited[i] = true;
                  System.out.print(" " + i);
                  r = i;
                  break;
               }
            }
         }
         n--;
      }
   }

   public void breadthFirstSearch(GraphQueue g, Node last, int curr, boolean[] mark) {
      int n = curr;
      g.enqueue(curr);
      mark[curr] = true;
      while (n <= 9) {
         for (int j = size - 1; j >= 0; j--) {
            if (adj_matrix[curr][j] != null) {
               if (!mark[j]) {
                  g.enqueue(j);
                  mark[j] = true;
               }
            }
         }
         if (curr == 0) {
            System.out.print(curr + " ");
            g.dequeue();
            curr = g.dequeue();
         } else {
            System.out.print(curr + " "); // 0
            curr = g.dequeue();
         }
         n++;
      }
   }
}