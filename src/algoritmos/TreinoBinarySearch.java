package algoritmos;

public class TreinoBinarySearch {

	public static void main(String[] args) {
		Integer[] v = {1, 3, 4, 6, 7, 9 };
		System.out.println(floorSearch(v, 0));
	}

	private static Integer floorSearch(Integer[] v, int e) {
		return floorSearchAuxiliar(v, e, 0, v.length - 1);
	}

	private static Integer floorSearchAuxiliar(Integer[] v, int e, int inicio, int fim) {
		Integer retorno = null;
		if (v != null && v.length >= 1) {
			if (e > v[fim]) {
				return v[fim]; }
			if (e < v[inicio]) {
				retorno = null;
			} else if (fim >= inicio) {
				int meio = (inicio + fim) / 2;
				if (v[meio].compareTo(e) == 0) {
					retorno = v[meio];
				} else if (v[meio].compareTo(e) < 0) {
					retorno = floorSearchAuxiliar(v, e, meio + 1, fim);
				} else {
					if (v[meio - 1] < e) {
						retorno = v[meio - 1];
					} else {
						retorno = floorSearchAuxiliar(v, e, inicio, meio - 1);
					}
				}

			}
		}
		return retorno;

	}

	private static int binarySearch(Integer[] v, int e) {
		return binarySearchAuxiliar(v, e, 0, v.length - 1);
	}

	private static int binarySearchAuxiliar(Integer[] v, int e, int inicio, int fim) {
		int retorno = -1;
		if (fim >= inicio) {
			int meio = (inicio + fim) / 2;
			if (v[meio].compareTo(e) == 0) {
				retorno = meio;
			} else if (v[meio].compareTo(e) > 0) {
				retorno = binarySearchAuxiliar(v, e, inicio, meio - 1);
			} else {
				retorno = binarySearchAuxiliar(v, e, meio + 1, fim);
			}
		}
		return retorno;
	}

}
