// Adjacency Matrix representation of an undirected graph in Java 

public class Graph {
    private static final int V = 4; // number of vertices in the graph
    int[][] adjMatrix = new int[V][V];
    
    // function to initialize the matrix to zero
    public void init() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                adjMatrix[i][j] = 0;
            }
        }
    }
    
    // function to add edges to the graph
    public void insertEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }
    
    // function to print the matrix elements
    public void printAdjMatrix() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Graph g = new Graph();
        g.init();
        
        g.insertEdge(0, 1);
        g.insertEdge(0, 2);
        g.insertEdge(1, 2);
        g.insertEdge(2, 0);
        g.insertEdge(2, 3);
        
        g.printAdjMatrix();
    }
}
