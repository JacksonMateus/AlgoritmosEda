package algoritmos;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int vetor[] = {1,5,3,2,5};
		int key;
		int j;
	
		for (int i = 1;i < vetor.length;i++) {
			key = vetor[i];
			for(j = i - 1; (j >= 0 && vetor[j] > key); j--) {
				vetor[j + 1] = vetor[j];
			}
			vetor[j + 1] = key;
			
		}
		
		
		System.out.println(Arrays.toString(vetor));

	}

}
