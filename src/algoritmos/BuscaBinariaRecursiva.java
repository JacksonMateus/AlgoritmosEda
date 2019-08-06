package algoritmos;

import java.util.Arrays;

public class BuscaBinariaRecursiva {
	public static void main(String[] args) {
		int[] v = { 2, 1, 5, 3, 4, 6 };
		Arrays.sort(v);
		System.out.println(buscaBinaria(v, 6)); }

	private static int buscaBinaria(int[] v, int e) {
		return buscaBinariaRecursiva(v, e, 0, v.length - 1);

	}

	private static int buscaBinariaRecursiva(int[] v, int e, int inicio, int fim) {
		int meio = (inicio + fim) / 2;

		if (fim >= inicio) {
			if (e == v[meio]) {
				return meio;
			} else if (e > v[meio])
				return buscaBinariaRecursiva(v, e, meio + 1, fim);

			else 
				return buscaBinariaRecursiva(v, e, inicio, meio - 1);

		} else
			return -1;

	}

}
