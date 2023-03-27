public class Main {
  public static void main(String[] args) {
  int V = 5; //Quantidade de vertice
  Graph g = new Graph(V);
  g.addEdge(0, 1);
  g.addEdge(0, 3);
  g.addEdge(1, 2);
  g.addEdge(1, 3);
  g.addEdge(2, 4);
  g.addEdge(2, 3);
  g.addEdge(3, 4);
  g.display();
  }
}
