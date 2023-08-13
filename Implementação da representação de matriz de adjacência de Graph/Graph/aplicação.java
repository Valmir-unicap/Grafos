import java.util.Scanner;

public class Graph {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("                     Grafos                           ");
        System.out.println("=====================================================");
        System.out.print("Digite a quantidade de vertíces: ");
        int qtdVertices;
        qtdVertices = in.nextInt();
        int[][]grafo = new int[qtdVertices][qtdVertices];
        preencherGrafo(grafo);
        exibir(grafo);
    }
    public static void exibir(int[][]grafo){
        int i,k;
        for(i=0;i<grafo.length;i=i+1){
            for(k=0; k<grafo[i].length; k++){

                if(grafo[i][k] == 1) {
                    System.out.println("Grafo na posição: " + i + " possui adjacente com o grafo: " + k);
                }

            }
        }
    }
    public static void preencherGrafo(int[][]grafo){
        Scanner in = new Scanner(System.in);
        System.out.println("Preencher Grafo");
        System.out.println("Digite 0 para não possuir adjacentes");
        System.out.println("Digite 1 para ter adjacentes");

        int i, k;
        for(i=0;i<grafo.length;i=i+1){
            for(k=0;k<grafo[i].length;k=k+1){
                System.out.print("Grafo na posição ["+i+","+k+"]: ");
                grafo[i][k]= in.nextInt();

                while(grafo[i][k] < 0 || grafo[i][k] > 1){
                    System.out.println("Você errou! Tente novamente");
                    System.out.println("Digite 0 para não possuir adjacentes");
                    System.out.println("Digite 1 para ter adjacentes");
                    System.out.print("Grafo na posição ["+i+","+k+"]: ");
                    grafo[i][k]= in.nextInt();
                }

            }
            System.out.println("");
        }
    }
}
