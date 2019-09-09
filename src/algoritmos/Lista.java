package algoritmos;

public class Lista {

	public static void main(String[] args) {
		int[] v = { 1, 5, 3, 2, 1, 8};
		System.out.println(selecionaMenorMaior(v, 3));

	}

	public static int selecionaMenor(int[] array) {
		int indiceMenor = 0;
		for (int j = 0; j < array.length; j++) {
			if (array[j] < array[indiceMenor]) {
				indiceMenor = j;
			}
		}
		return array[indiceMenor];
	}

	public static int selecionaMenorMaior(int[] array, int existente) {
		int indiceMenorMaior = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > existente) {
				indiceMenorMaior = i;
			}
			if (array[i] > existente && array[i] < array[indiceMenorMaior]) {
				indiceMenorMaior = i;

			}

		}
		return array[indiceMenorMaior];

	}

	public int estatisticaOrdem(int[] array, int k) {
		int ord = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= k) {
				ord++;
			}
		}
		return ord;
	}

	public int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		if (b == 1) {
			return b;
		}
		return a * pow(a, b - 1);

	}

	public String proximo(int array[], int x) {
		int diff = 999999999;
		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			if ((Math.abs(array[right] - array[left] - x) < diff)) {
				diff = (Math.abs(array[right] - array[left] - x));
			} else if ((Math.abs(array[right] - array[left] - x) > diff)) {
				left++;
			} else
				right++;

		}
		return left + " " + right;

	}

	public int floor(int[] v, int elemento) {
		int floor = v[0];
		for (int i = 1; i < v.length; i++) {
			if (v[i] <= elemento) {
				floor = v[i];
			}
		}
		return floor;

	}

}
