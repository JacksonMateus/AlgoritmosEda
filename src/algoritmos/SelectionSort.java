package algoritmos;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] v = { 2, 5, -1, 3, 4 };
		selectionSort(v);
		System.out.println(Arrays.toString(v));
	}

	public static void selectionSort(int[] v) {
		for (int fixo = 0; fixo < v.length - 1; fixo++) {
			int menor = fixo;
			for (int i = menor + 1; i < v.length; i++) {
				if (v[menor] > v[i]) {
					menor = i;
				}
			}
			System.out.println(Arrays.toString(v));

			int aux = v[fixo];
			v[fixo] = v[menor];
			v[menor] = aux;

		}
	}
}
