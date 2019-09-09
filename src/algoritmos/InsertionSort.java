package algoritmos;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int vetor[] = { 1, 5, 3, 2, 5 };
		int key;

		for (int i = 1; i < vetor.length; i++) {
			key = vetor[i];
			int j = i - 1;
			while (j >= 0 && vetor[j] > key) {
				int aux = vetor[j];
				vetor[j] = vetor[j+1];
				vetor[j+1] = aux;
				j--;
				} }
		System.out.println(Arrays.toString(vetor));


	}

}
