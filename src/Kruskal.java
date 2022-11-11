import java.util.ArrayList;
import java.util.LinkedList;

public class Kruskal {

	private static LinkedList<ArrayList<Integer>> conjuntos = new LinkedList<ArrayList<Integer>>();

	public static int executar(int[][] grafo, int arestas) {
		for (int i = 0; i < grafo.length; i++) {
			makeSet(i);
		}
		LinkedList<Integer[]> arestasOrdenadas = ordenarArestas(grafo, arestas);
		int origem = 0;
		int destino = 0;
		int custoTotal = 0;

		for (int i = 0; i < arestasOrdenadas.size(); i++) {
			origem = arestasOrdenadas.get(i)[0];
			destino = arestasOrdenadas.get(i)[1];

			if (findSet(origem) != findSet(destino)) {
				custoTotal += arestasOrdenadas.get(i)[2];
				union(origem, destino);
			}
		}
		return custoTotal;
	}

	public static LinkedList<Integer[]> ordenarArestas(int[][] grafo, int arestas) {
		LinkedList<Integer[]> arestasOrdenadas = new LinkedList<Integer[]>();
		int[][] grafoTemp = grafo.clone();
		Integer[] aresta = new Integer[3];

		while (arestasOrdenadas.size() != arestas) {
			int temp = 0;
			int menorValor = 501;
			for (int i = 0; i < grafoTemp.length; i++) {
				for (int j = 0; j < grafoTemp.length; j++) {
					temp = grafoTemp[i][j];
					if (temp >= 1 && menorValor > temp) {
						menorValor = temp;
						aresta[0] = i;
						aresta[1] = j;
						aresta[2] = temp;
					}
				}
			}
			grafoTemp[aresta[0]][aresta[1]] = -1; // -1 simboliza que já foi lido
			arestasOrdenadas.addLast(aresta.clone());
		}
		return arestasOrdenadas;
	}

	public static void makeSet(int vertice) {
		ArrayList<Integer> conjunto = new ArrayList<Integer>();
		conjunto.add(vertice);
		conjuntos.add(conjunto);
	}

	public static int findSet(int vertice) {
		for (int i = 0; i < conjuntos.size(); i++) {
			for (int j = 0; j < conjuntos.get(i).size(); j++) {
				if (conjuntos.get(i).get(j) == vertice) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void union(int u, int v) {
		int setU = findSet(u);
		int setV = findSet(v);
		conjuntos.get(setU).addAll(conjuntos.get(setV));
		conjuntos.remove(setV);
	}
}
