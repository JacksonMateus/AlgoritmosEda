package algoritmos;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] vetor = {4,2,4,5,1,2,3}; 
		quickSort(vetor,0,vetor.length-1);
		System.out.print(Arrays.toString(vetor));
	
	}
		
	private static void quickSort(int[] vetor,int inicio,int fim) {
			if (inicio < fim)  {
				int NovaPosicaoPivo = separar(vetor,inicio,fim);
				quickSort(vetor,inicio,NovaPosicaoPivo -1);
				quickSort(vetor, NovaPosicaoPivo + 1,fim);
			}
		}
		
	

	private static int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio +1;
		int j = fim;
		while(j >= i) {
			if(pivo >= vetor[i]) {
				i++; }
			else if(vetor[j] > pivo) {
				j--; }
			else {
				trocar(vetor,i,j);
				i++;
				j--;
			}
		}
		trocar(vetor, inicio, j);
		return j; }

	private static void trocar(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i]=vetor[j];
		vetor[j] = aux;
		
	}
	

	}

	

