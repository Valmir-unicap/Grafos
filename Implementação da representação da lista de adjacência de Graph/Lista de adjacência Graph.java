// Adjacency list representation of a graph in Java
import java.util.LinkedList;

public class Graph {
private int V; // number of vertices in the graph
private LinkedList<Integer>[] adjList; // array of adjacency lists

// constructor
public Graph(int V) {
    this.V = V;
    adjList = new LinkedList[V];
    for (int i = 0; i < V; i++) {
        adjList[i] = new LinkedList<Integer>();
    }
}

// function to add an edge to an undirected graph
public void addEdge(int src, int dest) {
    // Add an edge from src to dest
    adjList[src].add(dest);
    
    // Since graph is undirected, add an edge from dest to src also
    adjList[dest].add(src);
}

// function to print the adjacency list representation of graph
public void print() {
    for (int v = 0; v < V; v++) {
        System.out.print("The adjacency list of vertex " + v + " is: ");
        for (int neighbor : adjList[v]) {
            System.out.print(neighbor + " ");
        }
        System.out.println();
    }
  }
}
