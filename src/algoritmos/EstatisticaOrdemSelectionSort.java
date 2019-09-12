package algoritmos;

public class EstatisticaOrdemSelectionSort {

	public static void main(String[] args) {
		Integer[] array = { -1, 9, 4, 3,6, 2, 1 };
		System.out.println(estatiscaOrdem(array,3));
	}

	private static Integer estatiscaOrdem(Integer[] array, int k) {
		Integer menor = null;

		if (array != null && array.length > 0 && k > 0 && k <= array.length) {
			menor = array[0];

			for (int i = 1; i < array.length; i++) {
				if (array[i].compareTo(menor) <= 0) {
					menor = array[i];
				}
			}

			for (int i = 1; i <= k - 1; i++) {
				menor = selectionSort(array, menor);
			}
		}
		return menor;
	}

	private static int selectionSort(Integer[] array, int menor) {
		int max = 99999999;
		int proximoMenor = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].compareTo(menor) > 0 && array[i].compareTo(max) < 0) {
				proximoMenor = array[i];
				max = array[i];
			}
			
		}
		return proximoMenor;

	}

}
