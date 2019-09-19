package algoritmos;

import java.util.Arrays;

public class TreinoProvaLeda {

	public static void main(String[] args) {
		Integer[] array = { 1, 3, 5, 9, 12 };

		System.out.println(floor(array, 8));
	}

	private static Integer[] merge2arrays(Integer[] array1, Integer[] array2) {
		Integer[] arrayRetorno = new Integer[array1.length + array2.length];
		int i = 0;
		int j = array2.length - 1;
		int k = 0;
		while (i <= array1.length - 1 && j >= 0) {
			if (array1[i].compareTo(array2[j]) < 0) {
				arrayRetorno[k] = array1[i];
				i++;
			} else {
				arrayRetorno[k] = array2[j];
				j--;

			}
			k++;
		}
		while (i <= array1.length - 1) {
			arrayRetorno[k] = array1[i];
			i++;
			k++;
		}
		while (j >= 0) {
			arrayRetorno[k] = array2[j];
			j--;
			k++;
		}
		return arrayRetorno;

	}

	private static void bubbleSortRecursivo(Integer[] array) {
		bubbleSortRecursivoAuxiliar(array, 0);
	}

	private static void bubbleSortRecursivoAuxiliar(Integer[] array, int indice) {
		if (indice > array.length - 1) {
		} else {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] >= array[j + 1]) {
					int aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
					bubbleSortRecursivoAuxiliar(array, indice + 1);
				}
			}
		}
	}

	private static void selectionSortRecursivo(Integer[] array) {
		selectionSortRecursivoAux(array, 0);

	}

	private static void selectionSortRecursivoAux(Integer[] array, int i) {
		if (i > array.length - 1) {
		} else {
			int menor = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[menor] > array[j]) {
					menor = j;
				}
			}

			int aux = array[i];
			array[i] = array[menor];
			array[menor] = aux;
			selectionSortRecursivoAux(array, i + 1);
		}

	}

	private static Integer floor(Integer[] array, Integer e) {
		Integer retorno = null;
		if (array != null && array.length > 0 && e != null) {
			retorno = buscaFloor(array, e, 0, array.length - 1); }
		return retorno;}


	private static Integer buscaFloor(Integer[] array, Integer e, int leftIndex, int rightIndex) {
		Integer retorno = null;
		if (e < array[0]) {
			retorno = null; }
		else if(e > array[array.length-1]) {
			retorno = array[array.length-1]; }
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
						retorno = buscaFloor(array, e, leftIndex, meio-1); } } } } 
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
