package algoritmos;

import java.util.Arrays;

public class TreinoProvaLeda {

	public static void main(String[] args) {
		Integer[] array = { 3, 5, 6, 8, 9, 15, 17, 20 };
		Integer[] array2 = {};

		System.out.println(floor(array, 20));

	}

	private static Integer floor(Integer[] array, Integer e) {
			return buscaFloor(array, e, 0, array.length - 1); }


	private static Integer buscaFloor(Integer[] array, Integer e, int leftIndex, int rightIndex) {
		Integer retorno = null;

		if (array != null && array.length > 0 && e != null) {
			if (e < array[0]) {
				retorno = null;
			}
			else if(e > array[array.length-1]) {
				retorno = array[rightIndex];
			}
			else {
				if (rightIndex >= leftIndex) {
					int meio = (leftIndex+rightIndex)/2;
					if(array[meio].equals(e)) {
						retorno = array[meio]; }
					else if(array[meio].compareTo(e) < 0) {
						retorno = buscaFloor(array, e, meio+1, rightIndex);
					}
					else {
						if(array[meio-1].compareTo(e) < 0 ) {
							retorno = array[meio-1];
						}
						else {
							retorno = buscaFloor(array, e, leftIndex, meio-1); } } } } }
		return retorno;


	}

	private static void mergeSort(Integer[] v, int leftIndex, int rightIndex) {
		if (v.length > 0 && v != null && leftIndex >= 0 && rightIndex < v.length) {
			if (rightIndex > leftIndex) {
				int meio = (leftIndex + rightIndex) / 2;
				mergeSort(v, leftIndex, meio);
				mergeSort(v, meio + 1, rightIndex);
				intercalar(v, leftIndex, meio, rightIndex);
			}

		}
	}

	private static void intercalar(Integer[] v, int leftIndex, int meio, int rightIndex) {
		Integer[] arrayAux = new Integer[v.length];
		for (int i = leftIndex; i <= rightIndex; i++) {
			arrayAux[i] = v[i];
		}

		int i = leftIndex;
		int j = meio + 1;
		int k = leftIndex;

		while (i <= meio && j <= rightIndex) {
			if (arrayAux[j].compareTo(arrayAux[i]) < 0) {
				v[k] = arrayAux[j];
				j++;
			} else {
				v[k] = arrayAux[i];
				i++;
			}
			k++;
		}
		while (i <= meio) {
			v[k] = arrayAux[i];
			i++;
			k++;
		}
		while (j <= rightIndex) {
			v[k] = arrayAux[j];
			j++;
			k++;
		}

	}

	private static void selectionSort(Integer[] v, int leftIndex, int rightIndex) {
		if (v != null && v.length > 0 && leftIndex >= 0 && rightIndex < v.length && rightIndex > leftIndex) {
			for (int i = leftIndex; i < rightIndex; i++) {
				Integer menor = i;
				for (int j = i + 1; j <= rightIndex; j++) {
					if (v[j] < menor) {
						menor = j;
					}
				}
				troca(v, i, menor);
			}
		}

	}

	private static void insertionSort(Integer[] v, int inicio, int fim) {
		if (v.length > 0 && v != null && inicio >= 0 && fim < v.length && fim > inicio) {
			for (int i = inicio + 1; i <= fim; i++) {
				Integer key = v[i];
				int j = i - 1;
				while (j >= inicio && v[j].compareTo(key) > 0) {
					troca(v, j, j + 1);
					j--;
				}
			}
		}

	}

	private static void troca(Integer[] v, int i, int j) {
		Integer aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

}
