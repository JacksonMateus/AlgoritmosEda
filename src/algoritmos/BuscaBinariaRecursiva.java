package algoritmos;

import java.util.Arrays;

public class BuscaBinariaRecursiva {
	public static void main(String[] args) {
		int[] v = { 1, 1, 1, 4, 5, 5, 6, 7, 12 };

		System.out.println(contaOcorrencias(v, 5));
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

	private static Integer ceil(int[] v, int e, int inicio, int fim) {
		if (e < v[inicio])
			return v[inicio];
		if (e > v[fim]) {
			throw new IllegalArgumentException("manda as parada certa");
		}

		Integer retorno = null;
		if (fim >= inicio) {
			int meio = (inicio + fim) / 2;
			if (e == v[meio]) {
				retorno = e;
			} else if (e < v[meio]) {
				retorno = ceil(v, e, inicio, meio - 1);
			} else {
				if (v[meio + 1] > e) {
					retorno = v[meio + 1];
				} else
					retorno = ceil(v, e, meio + 1, fim);
			}
		}

		return retorno;
	}

	public static int contaOcorrencias(int[] array, int e) {
		int ocorrencias = 0;

		int primeiraOcorrencia = primeiraOcorrencia(array, e, 0, array.length - 1);
		int ultimaOcorrencia = ultimaOcorrencia(array, e, 0, array.length - 1);

		if (primeiraOcorrencia != -1 && ultimaOcorrencia != -1) {
			ocorrencias = ultimaOcorrencia - primeiraOcorrencia + 1;
		}
		return ocorrencias;

	}

	private static int primeiraOcorrencia(int[] array, int e, int inicio, int fim) {
		int retorno = -1;
		if (array[inicio] == e) {
			retorno = inicio;
		} else if (fim >= inicio) {
			int meio = (inicio + fim) / 2;
			if (array[meio] == e) {
				if (array[meio - 1] != e) {
					retorno = meio;
				} else {
					retorno = primeiraOcorrencia(array, e, inicio, meio - 1);
				}
			} else if (array[meio] > e) {
				retorno = primeiraOcorrencia(array, e, inicio, meio - 1);
			} else {
				retorno = primeiraOcorrencia(array, e, meio + 1, fim);
			}
		}
		return retorno;
	}

	private static int ultimaOcorrencia(int[] array, int e, int inicio, int fim) {
		int retorno = -1;
		if (e == array[fim]) {
			retorno = fim;
		} else if (fim >= inicio) {
			int meio = (inicio + fim) / 2;
			if (array[meio] == e) {
				if (array[meio + 1] != e) {
					retorno = meio;
				} else {
					retorno = ultimaOcorrencia(array, e, meio + 1, fim);
				}
			} else if (array[meio] > e) {
				retorno = ultimaOcorrencia(array, e, inicio, meio - 1);
			} else {
				retorno = ultimaOcorrencia(array, e, meio + 1, fim);
			}
		}
		return retorno;
	}

}
