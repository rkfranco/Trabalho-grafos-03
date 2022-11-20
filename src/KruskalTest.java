// Alunos
// Rodrigo Kapulka Franco
// Lorhan 

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KruskalTest {

	@Test
	public void test_01() {
		// Entrada
		// 5 6
		// 1 2 15
		// 1 3 10
		// 2 3 1
		// 3 4 3
		// 2 4 5
		// 4 5 20
		//
		// Saída
		// 34
		int vertices = 5;
		int arestas = 6;
		int[][] grafo = new int[vertices][vertices];
		grafo[0][1] = 15;
		grafo[0][2] = 10;
		grafo[1][2] = 1;
		grafo[2][3] = 3;
		grafo[1][3] = 5;
		grafo[3][4] = 20;
		int resultado = Kruskal.executar(grafo, arestas);
		assertEquals(34, resultado);
	}

	@Test
	public void test_02() {
		// Entrada
		// 4 6
		// 1 2 1
		// 1 3 10
		// 1 4 1
		// 2 3 1
		// 2 4 10
		// 3 4 1
		//
		// Saída
		// 3
		int vertices = 4;
		int arestas = 6;
		int[][] grafo = new int[vertices][vertices];
		grafo[0][1] = 1;
		grafo[0][2] = 10;
		grafo[0][3] = 1;
		grafo[1][2] = 1;
		grafo[1][3] = 10;
		grafo[2][3] = 1;
		int resultado = Kruskal.executar(grafo, arestas);
		assertEquals(3, resultado);
	}

	@Test
	public void test_03() {
		// Entrada
		// 6 11
		// 1 2 4
		// 1 4 3
		// 1 5 4
		// 2 3 8
		// 2 5 9
		// 2 6 5
		// 3 4 9
		// 3 5 3
		// 3 6 2
		// 4 6 7
		// 5 6 2
		//
		// Saída
		// 15
		int vertices = 6;
		int arestas = 11;
		int[][] grafo = new int[vertices][vertices];
		grafo[0][1] = 4;
		grafo[0][3] = 3;
		grafo[0][4] = 4;
		grafo[1][2] = 8;
		grafo[1][4] = 9;
		grafo[1][5] = 5;
		grafo[2][3] = 9;
		grafo[2][4] = 3;
		grafo[2][5] = 2;
		grafo[3][5] = 7;
		grafo[4][5] = 2;
		int resultado = Kruskal.executar(grafo, arestas);
		assertEquals(15, resultado);
	}

	@Test
	public void test_04() {
		// Entrada
		// 12 17
		// 1 2 4
		// 1 9 4
		// 1 12 7
		// 2 3 4
		// 2 11 8
		// 3 4 3
		// 3 12 6
		// 4 5 1
		// 4 11 2
		// 5 6 3
		// 6 10 2
		// 7 8 7
		// 7 10 2
		// 7 12 5
		// 8 9 3
		// 9 10 6
		// 10 11 4
		//
		// Saída
		// 33
		int vertices = 12;
		int arestas = 17;
		int[][] grafo = new int[vertices][vertices];
		grafo[0][1] = 4;
		grafo[0][8] = 4;
		grafo[0][11] = 7;
		grafo[1][2] = 4;
		grafo[1][10] = 8;
		grafo[2][3] = 3;
		grafo[2][11] = 6;
		grafo[3][4] = 1;
		grafo[3][10] = 2;
		grafo[4][5] = 3;
		grafo[5][9] = 2;
		grafo[6][7] = 7;
		grafo[6][9] = 2;
		grafo[6][11] = 5;
		grafo[7][8] = 3;
		grafo[8][9] = 6;
		grafo[9][10] = 4;
		assertEquals(33, Kruskal.executar(grafo, arestas));
	}

	@Test
	public void test_05() {
		// Entrada
		// 6 11
		// 1 2 20
		// 1 3 55
		// 1 5 45
		// 1 6 10
		// 2 4 5
		// 2 5 21
		// 2 6 70
		// 3 5 45
		// 4 5 55
		// 4 6 300
		// 5 6 4
		//
		// Saída
		// 84
		int vertices = 6;
		int arestas = 11;
		int[][] grafo = new int[vertices][vertices];
		grafo[0][1] = 20;
		grafo[0][2] = 55;
		grafo[0][4] = 45;
		grafo[0][5] = 10;
		grafo[1][3] = 5;
		grafo[1][4] = 21;
		grafo[1][5] = 70;
		grafo[2][4] = 45;
		grafo[3][4] = 55;
		grafo[3][5] = 300;
		grafo[4][5] = 4;
		int resultado = Kruskal.executar(grafo, arestas);
		assertEquals(84, resultado);
	}

}
