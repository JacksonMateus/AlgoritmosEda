package algoritmos;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] v = {4,6,7,3,5,1,2,6};
		int[] vAux = new int[v.length];
		mergeSort(v,vAux,0,v.length-1);
		
		System.out.println(Arrays.toString(v));

	}

	private static void mergeSort(int[] v, int[] vAux, int inicio, int fim) {
		if (fim > inicio) {
			int meio = (inicio + fim)/2;
			mergeSort(v, vAux, inicio, meio);
			mergeSort(v,vAux,meio+1,fim);
			intercalar(v,vAux,inicio,meio,fim);
		}
	}

	private static void intercalar(int[] v, int[] vAux, int inicio, int meio, int fim) {
		for(int k=inicio;k <= fim;k++) {
			vAux[k]=v[k];
		}
		
		int i = inicio;
		int j = meio + 1;
		
		for (int k = inicio; k <= fim;k++) {
			if (i > meio) {
				v[k] = vAux[j];
				j++;
			}
			else if ( j > fim) {
				v[k] = vAux[i];
				i++;
			}
			else if (vAux[j] > vAux[i]) {
				v[k] = vAux[i];
				i++; }
			else {
				v[k] = vAux[j];
				j++;
			}
			
		}
		
		
	}

}
