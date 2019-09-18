package algoritmos;

import java.util.Arrays;

public class JuntaArraysOrdenados {

	public static void main(String[] args) {
		int[] v1 = { 4, 6 };
		int[] v2 = { 3, 7 };
		 System.out.println(Arrays.toString((merge(v1, v2))));
	}

	private static int[] merge(int[] v1, int[] v2) {
		int i = 0;
		int i2 = 0;
		int k = 0;
		int[] arrayfinal = new int[v1.length + v2.length];
		
		while (i <= v1.length - 1 && i2 <= v2.length - 1) {
			if (v1[i] < v2[i2]) {
				arrayfinal[k] = v1[i];
				i++;
			} else {
				arrayfinal[k] = v2[i2];
				i2++;
			}
			k++;

		}
		while (i <= v1.length - 1) {
			arrayfinal[k] = v1[i];
			k++;
			i++;

		}
		while (i2 <= v2.length - 1) {

			arrayfinal[k] = v2[i2];

			i2++;

			k++;
		}

		return arrayfinal;

	}

}
