package algoritmos;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int vetor[] = { 1, 3, 5, 8, 10, 12, 4 };
		insertionSortUltimo(vetor);
		System.out.println(Arrays.toString(vetor));
	}

	private static void insertionSortUltimo(int[] vetor) {
			int key = vetor[vetor.length-1];
			int j = vetor.length-2;
			while(j>=0 && key < vetor[j]) {
				troca(vetor,j,j+1);
				j--;
				
		}

	}

	private static void troca(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
		
		
	}

	private static void insertionSort(int[] vetor) {
		int key;

		for (int i = 1; i < vetor.length; i++) {
			key = vetor[i];
			int j = i - 1;
			while (j >= 0 && vetor[j] > key) {
				int aux = vetor[j];
				vetor[j] = vetor[j + 1];
				vetor[j + 1] = aux;
				j--;
			}
		}

	}

}
