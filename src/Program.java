import java.util.Scanner;

public class Program {

	private static int vertices;
	private static int arestas;

	public static void main(String[] args) {
		int[][] grafo = entradaGrafo();
		int custo = Kruskal.executar(grafo, arestas);
		System.out.println("Custo total: " + custo);
	}

	public static int[][] entradaGrafo() {
		Scanner sc = new Scanner(System.in);

		String[] primeiraLinha = sc.nextLine().split(" ");

		vertices = Integer.parseInt(primeiraLinha[0]);
		arestas = Integer.parseInt(primeiraLinha[1]);

		int[][] grafo = new int[vertices][vertices];

		String[] leitura;
		int origem = 0;
		int destino = 0;

		for (int i = 0; i < arestas; i++) {
			leitura = sc.nextLine().split(" ");
			origem = Integer.parseInt(leitura[0]) - 1;
			destino = Integer.parseInt(leitura[1]) - 1;
			grafo[origem][destino] = Integer.parseInt(leitura[2]);
		}
		sc.close();
		return grafo;
	}
}
