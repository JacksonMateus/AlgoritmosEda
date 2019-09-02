package algoritmos;

import java.util.Arrays;

public class CoutingSort {
	public static void main(String[] args) {
		int[] v = { 2, 1, 3, 4, 2, 9, 5 };
		coutingSort(v, 0, v.length - 1);
		System.out.println(Arrays.toString(v));
	}

	private static void coutingSort(int[] v, int leftIndex, int rightIndex) {
		int maior = v[leftIndex];
		for (int i = leftIndex + 1; i <= rightIndex; i++) {
			if (v[i] > maior) {
				maior = v[i];
			}
		}
		int[] arrayCounting = new int[maior + 1];
		for (int i = leftIndex; i <= rightIndex; i++) {
			arrayCounting[v[i]]++;
		}

		int indexArray = leftIndex;

		for (int i = 0; i < arrayCounting.length; i++) {

			while (arrayCounting[i] != 0) {
				v[indexArray] = i;
				indexArray++;
				arrayCounting[i]--;
			}

		}

	}

}
