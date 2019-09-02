package algoritmos;

import java.util.Arrays;

public class BuscaBinariaRecursiva {
	public static void main(String[] args) {
		int[] v = { 0,1, 1, 1, 1, 1, 2, 2 };
		
		System.out.println(contaOcorrencias(v,2, 0, v.length-1));
	}

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

	/**
	 * Algoritmo floor que retorna o menor valor presente no array em relação ao
	 * valor que esta sendo passado como parametro, sao feitos as verificações, se o
	 * elemento parametro é maior que o array[meio], os elementos a esquerda do
	 * array[meio] sao descartados,e a recursao é chamada, se o v[meio] > elemento
	 * do parametro, entao é verificado se valor anterior a v[meio] ou seja v[meio -
	 * 1] é menor que o elemento, se sim entao é retornado o v[meio -1], se isso n
	 * acontecer a chamada a recursao (inicio = inicio ,fim = meio -1);
	 * 
	 * @param v
	 * @param e
	 * @param inicio
	 * @param fim
	 * @return
	 */
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
			} else if (e < v[meio]) {
				if (v[meio - 1] < e) {
					retorno = v[meio - 1];
				} else
					retorno = floor(v, e, inicio, meio - 1);
			} else {
				retorno = floor(v, e, meio + 1, fim);
			}
		}

		return retorno;
	}

	public static Integer contaOcorrencias(int[] v, int e, int inicio, int fim) {
		Integer retorno = null;
		if (fim >= inicio) {
			int meio = (inicio + fim)/2;
			if (v[meio] == e) {
				int contaOcorrencias = 0;

				if (v[meio - 1] == e) {
					for (int i = inicio; i <= meio; i++) {
						if (v[i] == e) {
							contaOcorrencias += 1;
						}
					}
				}
				if (v[meio + 1] == e) {
					for (int i = meio + 1; i <= fim; i++) {
						if (v[i] == e) {
							contaOcorrencias += 1;
						}
					}
				}
				
				retorno = contaOcorrencias;
			} else if (v[meio] > e)
				retorno = contaOcorrencias(v, e, inicio, meio - 1);
			else
				retorno = contaOcorrencias(v, e, meio + 1, fim);

		} else
			retorno = 0;
		return retorno;
	}
}
