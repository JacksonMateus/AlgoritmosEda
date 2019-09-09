package algoritmos;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		Integer[] vetor = {4,2,4,5,1,2,3}; 
		quickSort(vetor,0,vetor.length-1);
		System.out.print(Arrays.toString(vetor));
	
	}
		
	private static void quickSort(Integer[] vetor,int inicio,int fim) {
			if (inicio < fim)  {
				int NovaPosicaoPivo = separar(vetor,inicio,fim);
				quickSort(vetor,inicio,NovaPosicaoPivo -1);
				quickSort(vetor, NovaPosicaoPivo + 1,fim);
			}
		}
		
	

	private static int separar(Integer[] array, int leftIndex, int rightIndex) {
		Integer pivo = array[leftIndex];
		int posicaoPivo = leftIndex;
		for (int j = posicaoPivo + 1; j <= rightIndex; j++) {
			if (array[j].compareTo(pivo) < 0) {
				posicaoPivo++;
				trocar(array, posicaoPivo, j);

			}
		}
		trocar(array, leftIndex,posicaoPivo);
		return posicaoPivo;}

	private static void trocar(Integer[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i]=vetor[j];
		vetor[j] = aux;
		
	}
	

	}

	

