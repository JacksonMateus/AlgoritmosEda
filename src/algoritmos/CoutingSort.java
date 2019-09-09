package algoritmos;

import java.util.Arrays;


public class CoutingSort {
	public static void main(String[] args) {
		Integer[] v = {3,1,4,1};
		extendCoutingSort(v,0,v.length-1);
		System.out.println(Arrays.toString(v));
		
		
	}
	private static void extendCoutingSort(Integer[] array, int leftIndex, int rightIndex) {
		if (array != null && array.length != 0 && leftIndex >= 0 && rightIndex > leftIndex
				&& rightIndex < array.length) {

			Integer maior = array[leftIndex];
			Integer menor = array[leftIndex];

			for (int i = leftIndex + 1; i <= rightIndex; i++) {
				if (array[i].compareTo(maior) > 0) {
					maior = array[i];
				}
				if (array[i].compareTo(menor) < 0) {
					menor = array[i];
				}

			}

			int[] vetorOcorrencias = new int[(maior - menor) + 1];

			for (int i = leftIndex; i <= rightIndex; i++) {
				vetorOcorrencias[array[i] - menor] += 1;
			}

			for (int i = 0; i < vetorOcorrencias.length - 1; i++) {
				vetorOcorrencias[i + 1] += vetorOcorrencias[i];
			}

			Integer[] vetorAux = new Integer[array.length];

			for (int i = rightIndex; i >= leftIndex; i--) {
				Integer elemento = array[i];
				vetorOcorrencias[elemento - menor] -= 1;
				vetorAux[vetorOcorrencias[elemento - menor]] = elemento;

			}

			for (int i = leftIndex; i <= rightIndex; i++) {
				array[i] = vetorAux[i];

			}

		}
		
		
		

		
	}
	public static void countingSort(Integer[] array, int leftIndex, int rightIndex) {
		if (array != null && array.length != 0 && leftIndex >= 0 && rightIndex > leftIndex
				&& rightIndex < array.length) {
			Integer maior = array[leftIndex];

			for (int i = leftIndex + 1; i <= rightIndex; i++) {
				if (array[i].compareTo(maior) > 0) {
					maior = array[i];
				}
			}

			int[] vetorOcorrencias = new int[maior + 1];

			for (int i = leftIndex; i <= rightIndex; i++) {
				vetorOcorrencias[array[i]] += 1;
			}

			for (int i = 0; i < vetorOcorrencias.length - 1; i++) {
				vetorOcorrencias[i + 1] += vetorOcorrencias[i];
			}

			Integer[] vetorAux = new Integer[array.length];

			for (int i = rightIndex; i >= leftIndex; i--) {
				Integer elemento = array[i];
				vetorOcorrencias[elemento] -= 1;
				vetorAux[vetorOcorrencias[elemento]] = elemento;

			}

			for (int i = leftIndex; i <= rightIndex; i++) {
				array[i] = vetorAux[i];

			}

		}

	}
	
	
	

}
