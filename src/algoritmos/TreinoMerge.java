package algoritmos;

import java.util.Arrays;

public class TreinoMerge {

	public static void main(String[] args) {
		Integer[] v = { 4, 6, 7, 3, 5, 1, 2, 6 };
		mergeSort(v, 0, v.length - 1);
		System.out.println(Arrays.toString(v));

	}

	private static void mergeSort(Integer[] v, int inicio, int fim) {
		if (v != null && inicio >= 0 && fim < v.length) {
			if (fim > inicio) {

				int meio = (inicio + fim) / 2;
				mergeSort(v, inicio, meio);
				mergeSort(v, meio + 1, fim);
				intercalar(v, inicio, meio, fim);
			}
		}
	}

	private static void intercalar(Integer[] array, int leftIndex, int middle, int rightIndex) {
		Integer[] tempMergArr = new Integer[array.length];
		for (int i = leftIndex; i <= rightIndex; i++) {
			tempMergArr[i] = array[i];
		}

		int i = leftIndex;
		int j = middle + 1;
		int k = leftIndex;

		while (i <= middle && j <= rightIndex) {
			if (tempMergArr[i].compareTo(tempMergArr[j]) < 0) {
				array[k] = tempMergArr[i];
				i++;

			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}

	}

}
