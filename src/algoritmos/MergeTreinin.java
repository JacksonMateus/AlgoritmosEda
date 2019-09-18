package algoritmos;

import java.util.Arrays;

public class MergeTreinin {
	public static void main(String[] args) {
		Integer[] v = { 2, -1, 2, 15, 5, 4, 10 };
		mergeSort(v, 0, v.length - 1);
		System.out.println(Arrays.toString(v));

	}

	private static void mergeSort(Integer[] v, int inicio, int fim) {
		if (fim > inicio) {
			int meio = (inicio + fim) / 2;
			mergeSort(v, inicio, meio);
			mergeSort(v, meio + 1, fim);
			intercalar(v, inicio, fim, meio);
		}
	}

	private static void intercalar(Integer[] v, int inicio, int fim, int meio) {
		Integer[] arrayAux = new Integer[v.length];
		for (int i = inicio; i <= fim; i++) {
			arrayAux[i] = v[i];
		}

		int k = inicio;
		int i = inicio;
		int j = meio + 1;

		while (i <= meio && j <= fim) {
			if (arrayAux[i].compareTo(arrayAux[j]) < 0) {
				v[k] = arrayAux[i];
				i++;
			} else {
				v[k] = arrayAux[j];
				j++;
			}
			k++;
		}
		while (i <= meio) {
			v[k] = arrayAux[i];
			i++;
			k++;
		}
		while (j <= fim) {
			v[k] = arrayAux[j];
			j++;
			k++;
		}

	}

	private static Integer[] merge(Integer[] v, Integer[] v2) {
		Integer[] vetorRetorno = new Integer[v.length + v2.length];
		int k = 0;

		int i = 0;

		int i2 = 0;

		while (i <= v.length - 1 && i2 <= v2.length - 1) {
			if (v[i].compareTo(v2[i2]) < 0) {
				vetorRetorno[k] = v[i];
				i++;
			} else {
				vetorRetorno[k] = v2[i2];
				i2++;
			}
			k++;
		}
		while (i <= v.length - 1) {
			vetorRetorno[k] = v[i];
			i++;
			k++;
		}
		while (i2 <= v2.length - 1) {
			vetorRetorno[k] = v2[i2];
			i2++;
			k++;
		}
		return vetorRetorno;

	}

}
