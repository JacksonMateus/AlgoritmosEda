package algoritmos;

import java.util.Arrays;

public class TreinoProvaLeda2 {

	public static void main(String[] args) {
		Integer[] array = { 1, 5, 7, 9, 11, 11, 15 };
		System.out.println(buscaOcorrencias(array, 3));

	}

	private static Integer buscaOcorrencias(Integer[] array, Integer e) {
		Integer retorno = null;
		if (array != null && array.length >= 1 && e != null) {
			retorno = buscaOcorrenciasAux(array, e, 0, array.length - 1);
		}
		return retorno;

	}

	private static Integer buscaOcorrenciasAux(Integer[] array, Integer e, int leftIndex, int rightIndex) {
		Integer ocorrencias = 0;
		int primeiraOcorrencia = buscaPrimeiraOcorrencia(array, e, leftIndex, rightIndex);
		int ultimaOcorrencia = buscaUltimaOcorrencia(array, e, leftIndex, rightIndex);

		if (primeiraOcorrencia != -1 && ultimaOcorrencia != -1) {
			ocorrencias = ultimaOcorrencia - primeiraOcorrencia + 1;
		}
		return ocorrencias;

	}

	private static int buscaPrimeiraOcorrencia(Integer[] array, Integer e, int leftIndex, int rightIndex) {
		int retorno = -1;
		if(array[0].equals(e)) {
			retorno = 0;
		}
		else if (rightIndex >= leftIndex) {
			int meio = (leftIndex + rightIndex) / 2;
			if (array[meio].equals(e)) {
				if (!array[meio - 1].equals(e)) {
					retorno = meio;
				} else {
					retorno = buscaPrimeiraOcorrencia(array, e, leftIndex, meio - 1);
				}
			} else if (array[meio].compareTo(e) > 0) {
				retorno = buscaPrimeiraOcorrencia(array, e, leftIndex, meio - 1);
			} else {
				retorno = buscaPrimeiraOcorrencia(array, e, meio + 1, rightIndex);
			}
		}
		return retorno;
	}

	private static int buscaUltimaOcorrencia(Integer[] array, Integer e, int leftIndex, int rightIndex) {
		int retorno = -1;
		if (array[array.length-1].equals(e)) {
			retorno = array.length-1;
		}
		else if (rightIndex >= leftIndex) {
			int meio = (leftIndex + rightIndex) / 2;
			if (array[meio].equals(e)) {
				if (!array[meio + 1].equals(e)) {
					retorno = meio;
				} else {
					retorno = buscaUltimaOcorrencia(array, e, meio + 1, rightIndex);
				}
			} else if (array[meio].compareTo(e) > 0) {
				retorno = buscaUltimaOcorrencia(array, e, leftIndex, meio - 1);
			} else {
				retorno = buscaUltimaOcorrencia(array, e, meio + 1, rightIndex);
			}
		}
		return retorno;

	}

	private static void quickSort(Integer[] array, int leftIndex, int rightIndex) {
		if (array != null && array.length >= 1 && leftIndex >= 0 && rightIndex < array.length) {
			if (rightIndex > leftIndex) {
				int posicaoPivo = particiona(array, leftIndex, rightIndex);
				quickSort(array, leftIndex, posicaoPivo - 1);
				quickSort(array, posicaoPivo + 1, rightIndex);
			}
		}

	}

	private static int particiona(Integer[] array, int leftIndex, int rightIndex) {
		Integer pivot = array[leftIndex];
		int posicaoPivo = leftIndex;
		for (int i = leftIndex + 1; i <= rightIndex; i++) {
			if (array[i].compareTo(pivot) < 0) {
				posicaoPivo++;
				troca(array, posicaoPivo, i);
			}
		}
		troca(array, leftIndex, posicaoPivo);
		return posicaoPivo;

	}

	private static void insertionSort(Integer[] array, int leftIndex, int rightIndex) {
		if (array != null && array.length >= 1 && leftIndex >= 0 && rightIndex < array.length
				&& rightIndex > leftIndex) {
			for (int i = leftIndex + 1; i <= rightIndex; i++) {
				Integer key = array[i];
				int j = i - 1;

				while (j >= leftIndex && array[j].compareTo(key) > 0) {
					troca(array, j, j + 1);
					j--;
				}
			}
		}

	}

	private static void troca(Integer[] array, int i, int j) {
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;

	}

}
