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
	private static Integer floor(int[] v, int e, int inicio, int fim) {
		if (e > v[fim])
			return v[fim];
		if (e < v[0]) 
			throw new RuntimeException("manda as parada certa");

		Integer retorno = null;
		if (fim >= inicio) {
			int meio = (inicio + fim) / 2;
			if (e == v[meio]) {
				retorno = e;
			}
			else if (e < v[meio]) {
				if (v[meio - 1] < e) {
					retorno = v[meio - 1];
				} else
					retorno = floor(v, e, inicio, meio - 1);
			}
			else {
				retorno = floor(v, e, meio + 1, fim);
			} }
		
	
		return retorno;
	}

}
